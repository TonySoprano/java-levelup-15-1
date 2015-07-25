package Lecture5;

import java.util.Scanner;

/**
 * Created by Artem on 09.07.2015.
 */
public class WordInput1 {
    public String word;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the search word:");
        word = scanner.nextLine();
        //  System.out.println(word);
    }
}
