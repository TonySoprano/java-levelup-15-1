package Lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Artem on 09.07.2015.
 */
public class FileInput1 {
    public String file;
    // public String word;

    public void enterFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of file:");
//        file = scanner.nextLine();
        WordInput1 wordInput = new WordInput1();
        try {
            file = scanner.nextLine();
            //  word = scanner.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            wordInput.input();
            boolean counter = true;
            while ((line = br.readLine()) != null) {
                if (line.indexOf(wordInput.word) >= 0) {
                    System.out.println(line);
                    counter = false;
                }
            }
            if (counter) {
                System.out.println("Searching word not found");
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found.");
            enterFile();
        } catch (IOException e) {
            //   e.printStackTrace();            System.out.println("Exeption while reading file");
        } catch (NoSuchElementException e) {
            System.out.println("");
            System.out.println("File not found.");
        }

    }
}
