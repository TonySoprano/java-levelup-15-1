package Lecture13;

import java.io.File;

/**
 * Created by roman on 13.08.15.
 */
public class Rm implements MyCommand {
    private   String command = "rm";
    private boolean exist = false;
    @Override
    public boolean isExist(String command) {
        if (this.command.equals(command)){
            exist = true;
            return true;
        } else
        return false;
    }

    @Override
    public void doSomething(String file) {
        if (exist){
        File file1 = new File(file);

        if (file1.exists()){
            System.out.println("File exists and it will be deleted.");
            file1.delete();
            System.out.println("File deleted.");
        } else {
            System.out.println("File not exists");
        }
        }
    }
}
