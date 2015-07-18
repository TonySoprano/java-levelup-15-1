package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by ivanm on 07.07.2015.
 */
public abstract class MyArray {
    protected Integer lengthOfArray, heightOfArray;
    protected Integer maxValue, minValue;
    protected MyRandomGenerator randomGenerator;
    protected Integer[] array;
    protected static Integer count = 0;

    MyArray(){
        count++;
    }
    public abstract boolean initializeArray();
    public abstract void sortArray();
    public abstract void printArray(String textTitle);

    public void TaskOperations(){

        if(initializeArray()){

            printArray("Unsorted array");
            sortArray();
            printArray("Sorted array");
        }
        else{
            System.out.println("Emergency exit! Skip the task!");
        }


    }

    protected Integer readValueFromConsol(String textTitleOfValue, Integer min){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println(textTitleOfValue);
        // делаем цикл пока не введем подходящее число или не напишем exit

        Integer value;
        while (true){
            String s = "";
            try {
                s = bufferedReader.readLine();
                if(s.equals("exit")){
                    return null;
                }

                value = Integer.parseInt(s);

            }
            catch (IOException e) {
                System.out.println("Incorrect input. Try again or type exit");
                continue;
            }
            catch (NumberFormatException e){
                System.out.println("You have entered an incorrect number. Try again or type exit");
                continue;
            }
            if (value != null && value <= min) {
                System.out.println("You have entered an incorrect number. Try again or type exit");
                continue;
            }

            break;

        }
        return value;
    }

}
