package lecture11;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ivan on 23.07.2015.
 */
public class MyContainer<T> {
    private T[] arrayObject;
    private int sizeOfArray;
    private int currentIndex;

    MyContainer(){
        sizeOfArray = 10;
        currentIndex = 0;
        arrayObject = (T[])new Object[sizeOfArray];
    }

    public T getValue(int index){
        return arrayObject[index];
    }

    private T[] increaseArray(){
        sizeOfArray = sizeOfArray*2;
        T[] tempArray = (T[])new Object[sizeOfArray];
        for (int i = 0; i < arrayObject.length; i++) {
           tempArray[i] = arrayObject[i];
        }

        return tempArray;
    }

    public void print(){
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(arrayObject[i] + "; ");
        }
        System.out.println();
    }

    public void add(T value){
        if (currentIndex == arrayObject.length-1){
            if (currentIndex == Integer.MAX_VALUE || sizeOfArray*2 > Integer.MAX_VALUE){
                System.out.println("Array size peaked!");
                return;
            }
            //need to increase the size
            arrayObject = increaseArray();
        }


        arrayObject[currentIndex++] = value;
    }

    public void clearArray(){
        arrayObject = (T[])new Object[sizeOfArray];
        currentIndex = 0;
    }

    public void deleteValue(int index){
        for (int i = index; i <= currentIndex; i++) {
            if (i == arrayObject.length-1){
                arrayObject[i] = null;
            }
            else{
                arrayObject[i] = arrayObject[i+1];
            }

        }
        currentIndex--;
    }
}
