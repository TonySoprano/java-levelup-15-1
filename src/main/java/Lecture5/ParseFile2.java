package Lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Artem on 10.07.2015.
 */
public class ParseFile2 {
    String file;
    String word;
    private String line;
    private boolean counter = true;

    public void parseFile(String file,String word) {
        this.file = file;
        this.word = word;
//        if (word.equals(null)){
//            word = null;
//        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            parseLine(br,word);
        } catch (FileNotFoundException e) {

            parseFile(enterFile(),word);

        } catch (NullPointerException e) {
//            enterFile();
            parseFile(enterFile(),word);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("String not found");
        }
    }

    public void parseFile(String file) {
        this.file = file;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            parseLine(br);
        } catch (FileNotFoundException e) {

            parseFile(enterFile());

        } catch (NullPointerException e) {
//            enterFile();
            parseFile(enterFile());
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("String not found");
        }
    }


    public String enterFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter correct file name:");
        file = scanner.nextLine();
        return file;
        //parseFile(file,word);
    }

    public void parseLine(BufferedReader br, String str) {
        try {
            while ((line = br.readLine()) != null) {
                if (line.indexOf(word) >= 0) {
                    System.out.println(line);
                    counter = false;
                }
            }
            if(counter) {
                System.out.println("No such string in this file.");
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Не корректно работет парсер");
        }
    }
    public void parseLine(BufferedReader br) {
        try {
            while ((line = br.readLine()) != null) {
                    System.out.println(line);
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Не корректно работет парсер");
        }
    }
}