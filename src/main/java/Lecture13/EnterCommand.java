package Lecture13;

import java.util.Scanner;

/**
 * Created by roman on 14.08.15.
 */
public class EnterCommand {
    String file;
    private String command;
    private String fileName;

    public void TypeSomething() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file");
        file = scanner.nextLine();
    }
//        System.out.println(file);
        // Finding first word in the input string ( Command)

        public String getCommand(){
            command = file.substring(0,file.indexOf(" "));
            return command;
    }
//        System.out.println(command);
        // Finding second word in the input string (File or directory)
        public String getFileName() {
            fileName = file.substring(file.indexOf(" ") + 1);
            return fileName;
//            System.out.println(fileName);
        }



    }

