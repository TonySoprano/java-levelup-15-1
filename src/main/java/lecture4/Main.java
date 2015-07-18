package lecture4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Created by ivanm on 07.07.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<MyArray> listOfArrays = new ArrayList<MyArray>();

        //task 1
        listOfArrays.add(new MyOneDimensionalArray(6, 0, 100));
        //task 2
        listOfArrays.add(new MyTwoDimensionalArray(6, 5, 0, 100));
        //task 3
        listOfArrays.add(new MyOneDimensionalArray());
        //task 4
        listOfArrays.add(new MyTwoDimensionalArray());

        for (MyArray currentArray : listOfArrays){
            currentArray.TaskOperations();
        }

    }


}
