package lecture5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Oleg Knyazev
 * on 08.07.2015.
 */
public class Exercise1 {
    public static void main(String[] args) {

       do {
           String nameFile, searchWord;
           Scanner scanner = new Scanner(System.in);
           System.out.println("Please enter a file name ");
           nameFile = scanner.nextLine();
           System.out.println("Please enter a search word");
           searchWord = scanner.nextLine();
           try{
               BufferedReader br = new BufferedReader(new FileReader(nameFile));
               break;
           }catch (FileNotFoundException e) {
               System.out.println("Sorry, not correct file name, enter again");
           }
       }while(true);



    }
}