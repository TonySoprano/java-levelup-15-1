package Lecture5;

import java.util.Scanner;


/**
 * Created by Artem on 09.07.2015.
 */
public class StringInput1 {
    public String strInp1;


    public void input() {
        System.out.print("Input the string:");
        Scanner scanner = new Scanner(System.in);
        strInp1 = scanner.nextLine();

        int command = strInp1.indexOf("grep ");

        if (command!=0){
            System.out.println("Repet command grep:");
            input();
        }else {
            int firstSpase = strInp1.indexOf(' ');
            int secondSpase = strInp1.indexOf(' ',firstSpase+1);
            String file = strInp1.substring(firstSpase + 1,secondSpase);
            String word = strInp1.substring(secondSpase + 1);

          //  System.out.println("It is right command "+file+" "+word);
        }
    }
}
