package lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by User on 10.07.2015.
 */
public class Print {

    private boolean wordSuccess = true;
    private String file;
    private String word;
    private String line;

    public Print (String file, String word) {
        this.file = file;
        this.word = word;
    }

    public void print() throws FileNotFoundException {

        BufferedReader arrFile = new BufferedReader(new FileReader(file));

        try {
            while ((line = arrFile.readLine()) != null) {
                if (line.indexOf(word) >= 0) {
                    System.out.println(line);
                    wordSuccess = false;
                }
            }
        } catch (FileNotFoundException e) {
            print();
        } catch (IOException e) {

        }

        if(wordSuccess) {
            System.out.println("Поиск не дал результатов");
        }
    }
}