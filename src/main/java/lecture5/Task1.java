package lecture5;

import java.io.*;

/**
 * Created by java on 08.07.2015.
 */
public class Task1 {
    static BufferedReader brConsol = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedReader getFile(){

        BufferedReader brFile;
        System.out.println("Enter file name:");

        while (true){

            try {
                String fileName = brConsol.readLine();
                if(fileName.equals("exit")){
                    System.out.println("Emergency exit");
                    return null;
                }

                brFile = new BufferedReader(new FileReader(fileName));
                break;
            }
            catch (FileNotFoundException e){
                System.out.println("Incorrect file name, try again or type exit");
            }
            catch (IOException ignore) {
            }
        }
        return brFile;
    }

    public static String getWord(){
        System.out.println("Enter word:");
        String substring = "";
        try {
            substring = brConsol.readLine();
        } catch (IOException ignore) {
        }

        if (substring.equals("")){
            System.out.println("Empty word!");
            return null;
        }
        return substring;
    }

    public static void print(BufferedReader brFile, String substring){
        String currentLine;
        try {
            while ((currentLine = brFile.readLine()) != null){
                if(currentLine.indexOf(substring) >= 0){
                    System.out.println(currentLine);
                }
            }
        } catch (IOException ignore) {
        }
    }

    public static void main(String[] args) {

        BufferedReader brFile = getFile();
        String substring = getWord();
        if(brFile == null || substring == null){
            return;
        }
        print(brFile, substring);

    }
}
