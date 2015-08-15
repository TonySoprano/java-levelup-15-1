package Lecture13;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by roman on 13.08.15.
 */
public class Rm implements MyCommand {
    private String command = "rm";
    private boolean valid = false;

    @Override
    public boolean isValid(String command) {
        if (this.command.equals(command)) {
            valid = true;
            return true;
        } else
            return false;
    }

    @Override
    public void doSomething(ArrayList<String> file) {
        if (valid) {
            File[] file1 = new File[file.size()];
            for (int i = 0; i < file1.length; i++) {
                file1[i] = new File(file.get(i));
            }
            for (int i = 0; i < file1.length; i++) {

                if (file1[i].exists()) {
                    System.out.println("File " + file1[i] + " exists and it will be deleted.");
                    file1[i].delete();
                    System.out.println("File " + file1[i] + " deleted.");
                } else {
                    System.out.println("File or directory " + file1[i] + " not exists.");
                }
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
