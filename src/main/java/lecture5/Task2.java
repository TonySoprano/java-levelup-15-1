package lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 09.07.2015.
 */
public class Task2 extends Reader {

    BufferedReader reader = new Reader().reader();
    String foundFile;
    String foundWord;
    String[] str;

    public void inputPrint() {

        try {
            System.out.print("Укажите команду: ");
            str = reader.readLine().split(" ");
            foundWord = str[2];

            if(str[1].indexOf(".txt") < 0) {
                foundFile = str[1]+".txt";
            } else {
                foundFile = str[1];
            }

            if (!str[0].equals("grep")) {
                throw new NullPointerException();
            }

            if(!new FileExists(foundFile).fileExt()) {
                throw new FileNotFoundException();
            }

            new Print(foundFile,foundWord).print();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден укажите команду повторно");
            inputPrint();
        } catch (NullPointerException e) {
            System.out.println("Команда указана не верно");
            inputPrint();
        } catch (Exception e) {
            System.out.println("Что то пошло не так, повторите попытку");
        }
    }
}
