package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ivanm on 07.07.2015.
 */
public class MyTwoDimensionalArray extends MyArray {
    protected Integer[][] array;
    Integer taskNumber;

    MyTwoDimensionalArray(Integer lengthOfArray, Integer heightOfArray, Integer minValue, Integer maxValue) throws IOException {
        this.lengthOfArray = lengthOfArray;
        this.heightOfArray = heightOfArray;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.taskNumber = count;
    }

    MyTwoDimensionalArray()  {
        this.taskNumber = count;
    }


    @Override
    public boolean initializeArray()
    {
        System.out.println("==================================================");
        System.out.println("Task "+ taskNumber);
        System.out.println("==================================================");
        if (lengthOfArray == null){
            lengthOfArray = readValueFromConsol("Enter length of array:", -1);
            if (lengthOfArray == null)    {
                return false;
            }
        }
        if (heightOfArray == null){
            heightOfArray = readValueFromConsol("Enter height of array:", -1);
            if (heightOfArray == null)    {
                return false;
            }
        }

        if (minValue == null){
            minValue = readValueFromConsol("Enter min value for ramdom generator:", 0);
            if (minValue == null)    {
                return false;
            }
        }
        if (maxValue == null){
            maxValue = readValueFromConsol("Enter max value for ramdom generator:", minValue);
            if (maxValue == null)    {
                return false;
            }
        }

        array = new Integer[lengthOfArray][heightOfArray];
        randomGenerator = new MyRandomGenerator(minValue, maxValue);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomGenerator.getRandomValue();
            }

        }
        return true;
    }

    @Override
    public void sortArray() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                newArray.add(array[i][j]);
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            Integer min = newArray.get(i);
            Integer min_i = i;
            for (int j = i + 1; j < newArray.size(); j++) {
                if (min > newArray.get(j)){
                    min = newArray.get(j);
                    min_i = j;
                }
            }
            if (min_i != i) {
                Integer temp = newArray.get(i);
                newArray.set(i,min);
                newArray.set(min_i,temp);
            }
        }
        int index = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = newArray.get(index++);
            }

        }
    }

    private String AddSpaceBefore(Integer value, Integer numberOfCharacters){
        String result = value.toString();
        Integer localNumberOfCharacters = result.length();
        Integer difference = numberOfCharacters - localNumberOfCharacters;
        for (int i = 0; i < difference; i++)
        {
            result = " " + result;
        }
        return result;
    }


    @Override
    public void printArray(String textTitle) {
        System.out.println(textTitle);

        Integer numberOfCharacters = array[lengthOfArray-1][heightOfArray-1].toString().length();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(AddSpaceBefore(array[i][j],numberOfCharacters) + " ");
            }
            System.out.println();
        }
    }
}
