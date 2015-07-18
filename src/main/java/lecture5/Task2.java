package lecture5;

import java.io.*;

/**
 * Created by java on 08.07.2015.
 */
public class Task2 {
    static BufferedReader brConsol = new BufferedReader(new InputStreamReader(System.in));
    static BufferedReader brFile;
    static String[] strArgs;

    public static boolean setInputArguments(){
        System.out.println("Enter line:");
        while (true){
            try {
                String eString = brConsol.readLine();
                if(eString.equals("exit")){
                    System.out.println("Emergency exit");
                    return false;
                }

                strArgs = getArguments(eString);
                if (strArgs == null){
                    System.out.println("Wrong input, try again, or enter exit");
                    continue;
                }

                if(!strArgs[0].equals("grep")) {
                    System.out.println("Wrong input, try again, or enter exit");
                    continue;
                }

                brFile = new BufferedReader(new FileReader(strArgs[1]));
                return true;
            }
            catch (FileNotFoundException e){
                System.out.println("Incorrect file name, try again or type exit");
            }
            catch (IOException ignore) {
            }
        }
    }

    public static String[] getArguments(String eString) {

        String[] strArgs = new String[3];

        int indexSpace1 = eString.indexOf(" ");
        if(indexSpace1 > -1){
            strArgs[0] = eString.substring(0, indexSpace1);

            String s1 = eString.substring(indexSpace1+1, eString.length());
            int indexSpace2 = s1.indexOf(" ");
            if (indexSpace2 > -1){
                strArgs[1] = s1.substring(0, indexSpace2);
                strArgs[2] = s1.substring(indexSpace2+1, s1.length());
                return strArgs;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }

    public static void print(){
        String currentLine;
        try
        {
            while ((currentLine = brFile.readLine()) != null)
            {
                if (currentLine.indexOf(strArgs[2]) >= 0)
                {
                    System.out.println(currentLine);
                }
            }
        }
        catch (IOException ignore)
        {
        }
    }

    public static void main(String[] args) {
        if (setInputArguments())
        {
            print();
        }
    }

}
