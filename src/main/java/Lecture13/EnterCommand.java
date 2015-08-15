package Lecture13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by roman on 14.08.15.
 */
public class EnterCommand {
    String file;
    private String command;
    private String fileName;
    public ArrayList<String> listcommand = new ArrayList<String>();

    public void TypeSomething() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the command:");
        file = scanner.nextLine();

//        System.out.println(file);
        // Finding first word in the input string ( Command)
        String[] s = file.split(" ");
        for (int i = 0; i < s.length; i++) {
            listcommand.add(s[i]);
        }
    }

    public String getCommand() {
        if (listcommand.isEmpty()) {
            return null;
        } else {
            command = listcommand.get(0);
            return command;
        }

    }

    public ArrayList<String> getFileName() {
         listcommand.remove(0);
        return listcommand;
    }
}

