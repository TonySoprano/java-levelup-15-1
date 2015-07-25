package Lecture4;

import java.util.Random;

/**
 * Created by Artem on 07.07.2015.
 */
public class Main1 {
    public static final int min = 5;
    public static int max = 10;

    public static void main(String[] args) {
        //создаем массив
        int[] listArray = new int[10];
        // заполняем матрицу случайными числами
        for (int i = 0; i < listArray.length; i++) {
            listArray[i] = new Random().nextInt(max - min + 1) + min;
        }
        // Output array on screen
        for (int i = 0; i < listArray.length; i++) {
            System.out.print(listArray[i] + " ");
        }
        //Sorting massive
        for (int i = listArray.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                int element;
                if (listArray[j] > listArray[j + 1]) {
                    element = listArray[j];
                    listArray[j] = listArray[j + 1];
                    listArray[j + 1] = element;
                }
            }
        }
        System.out.println("");
        System.out.println("Отсортированный массив");
        for (int i = 0; i < listArray.length; i++) {
            System.out.print(listArray[i] + " ");
        }

    }
}
