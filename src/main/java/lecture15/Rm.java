package lecture15;

import java.io.*;

/**
 * Created by Ivan Moskalchenko on 15.08.2015.
 */
public class Rm implements CommandResolver {
    @Override
    public boolean isWorks(String name) {
        if(name.equals("rm")){
            return true;
        }
        return false;
    }

    @Override
    public String ExecuteCommand(String[] parts) throws IOException {
        if (parts.length != 2) {
            return "Incorrect number of parameters!";
        }

        String path = parts[1];
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] fileList = file.listFiles();
                if (fileList.length > 0) {
                    for (int i = 0; i < fileList.length; i++) {
                        String[] arg = new String[2];
                        arg[0] = "rm";
                        arg[1] = fileList[i].getAbsolutePath();
                        ExecuteCommand(arg);
                    }
                    file.delete();
                    return "Folder " + path + " has been successfully deleted!";

                } else {
                    file.delete();
                    return "Folder " + path + " has been successfully deleted!";
                }

            } else {

                file.delete();
                return "File " + path + " has been successfully deleted!";

            }

        } else {
            return "There is no file on the path " + path;
        }
        //return "";
    }
}


