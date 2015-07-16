package lecture5;

import java.io.*;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 08.07.2015.
 */
public class Task1 extends Reader {

    String foundFile;
    String foundWord;
    BufferedReader reader = new Reader().reader();

    public void print() {

        try {
            System.out.print("Укажите имя файла: ");
            foundFile = reader.readLine();

            if(foundFile.indexOf(".txt") < 0) {
                foundFile += ".txt";
            }

            if(!new FileExists(foundFile).fileExt()) {
                throw new FileNotFoundException();
            }

            System.out.print("Укажите слово для поиска: ");
            foundWord = reader.readLine();

            new Print(foundFile,foundWord).print();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            print();
        } catch (Exception e) {
            System.out.println("Что то пошло не так, повторите попытку");
        }
    }
}
