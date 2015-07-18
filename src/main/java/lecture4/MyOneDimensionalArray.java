package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ivanm on 07.07.2015.
 */
public class MyOneDimensionalArray extends MyArray {
    Integer taskNumber;
    MyOneDimensionalArray(Integer lengthOfArray, Integer minValue, Integer maxValue) {
        this.lengthOfArray = lengthOfArray;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.taskNumber = count;
      //  this.randomGenerator = new MyRandomGenerator(minValue, maxValue);
    }

    MyOneDimensionalArray() {
        this.taskNumber = count;
    }




    @Override
    public boolean initializeArray() {
        System.out.println("==================================================");
        System.out.println("Task "+ taskNumber);
        System.out.println("==================================================");
        if (lengthOfArray == null){
            lengthOfArray = readValueFromConsol("Enter length of array:", -1);
            if (lengthOfArray == null)    {
                return false;
            }
        }
        if (minValue == null){
            minValue = readValueFromConsol("Enter min value for ramdom generator:", -1);
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
        array = new Integer[lengthOfArray];
        randomGenerator = new MyRandomGenerator(minValue, maxValue);

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.getRandomValue();
        }
        return true;
    }

    @Override
    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            Integer min = array[i];
            Integer min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]){
                    min = array[j];
                    min_i = j;
                }

            }
            if (min_i != i) {
                Integer temp = array[i];
                array[i] = min;
                array[min_i] = temp;

            }

        }
    }

    @Override
    public void printArray(String textTitle) {
        System.out.println(textTitle);
        System.out.println(Arrays.toString(array));
    }
}
