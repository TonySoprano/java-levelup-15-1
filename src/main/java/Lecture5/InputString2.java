package Lecture5;

import java.util.Scanner;

/**
 * Created by Artem on 10.07.2015.
 */
public class InputString2 {
    private String str;
    public String file;
    public String word;
    Scanner scaner = new Scanner(System.in);

    public void enterStr() {
        System.out.print("Enter the command:");
        str = scaner.nextLine();
        //System.out.println(str);
        findGrep();

    }

    public void findGrep() {
        if (str.indexOf("grep") == 0) {
            findFileName();
            ParseFile2 parseFile = new ParseFile2();
            if (word==null){
                parseFile.parseFile(file);
            }else {
                parseFile.parseFile(file, word);
            }
        } else {
            System.out.println("Command is not correct");
            new InputString2().enterStr();
        }

    }

    public void findFileName() {
        try {
            int firstSpase = str.indexOf(" ");
            int secondSpase = str.indexOf(" ", firstSpase + 1);
            if(secondSpase == -1){
                file = str.substring(firstSpase+1);
                word = null;
            }else {
                file = str.substring(firstSpase + 1, secondSpase);
                word = str.substring(secondSpase + 1);
            }
//            System.out.println(word);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("File not found");
//            enterFile();
           // ParseFile parseFile = new ParseFile();
        }
    }
//    public void enterFile(){
//        System.out.print("Enter correct file name:");
//        file = scaner.nextLine();
//    }
}