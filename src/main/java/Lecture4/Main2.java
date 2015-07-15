package Lecture4;

/**
 * Created by Artem on 07.07.2015.
 */

import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main2 {


    public static int min = 1; //Нижняя граница генерации случайных чисел
    public static int max = 100; //Верхняя граница генерации случайных чисел

    public static void main(String[] args) {

        int m = 100;
        int n = 100;
        int i = 0;
        int count = 0;
        //int j = 0;
        long startTime = System.currentTimeMillis();

        long start = Runtime.getRuntime().freeMemory();

        //int j = 0;
        int[][] z = new int[m][n];

        while (i < m) {
            int j = 0;
            while (j < n) {
                z[i][j] = new Random().nextInt(max - min + 1) + min;
                j++;
            }
            i++;
        }
        /*
        System.out.println("-----------------------------------------------------------");
        System.out.println("ЗАПОЛНЕННАЯ МАТРИЦА");
        System.out.println("-----------------------------------------------------------");
        for(int k=0;k<m;k++){
            for(int g=0;g<n;g++){
                System.out.print(z[k][g]+ " ");
            }
            System.out.println();

        }
        */
        // Cсортировка в матрице
        // ЦИКЛ ПО ПРОХОЖДЕНИЮ ВСЕХ ИТЕРАЦИЙ ДЛЯ СОРТИРОВКИ(ВОЗМОЖНО ЕСТЬ ИЗИЛИШЕК)
        for (int h = 1; h < m * n * 0.75; h++) {
            int temp = z[0][0];
            int temp2 = z[0][0];
            //СОРТИРОВКА В КАЖДЫЙ СТРОКЕ МАТРИЦЫ
            for (int k = 0; k < n - 1; k++) {
                for (int g = 0; g < m; g++) {
                    temp = z[g][k];
                    count++;
                    if (temp > z[g][k + 1]) {
                        temp = z[g][k + 1];
                        z[g][k + 1] = z[g][k];
                        z[g][k] = temp;
                        temp2 = z[g][k + 1];
                    }
                }
                // БЛОК ДЛЯ ЗАМЕНЫ ПОСЛЕДНЕГО ЭЛЕМЕНТА В СТРОКЕ ЕСЛИ ОН БОЛЬШЕ СЛЕДУЮЩЕГО РЯДА 1-ГО ЭЛЕМЕНТА
                for (int j = 0; j < m - 1; j++) {
                    if (z[j + 1][0] < z[j][n - 1]) {
                        int temp3 = z[j][n - 1];
                        z[j][n - 1] = z[j + 1][0];
                        z[j + 1][0] = temp3;
                    }
                    //    System.out.println(z[j][n-1]);
                }
                //z[k][m]
            }
        }
        /*
        System.out.println("-----------------------------------------------------------");
        System.out.println("ОТСОРТИРОВАННАЯ МАТРИЦА");
        System.out.println("-----------------------------------------------------------");
        for(int k=0;k<m;k++){
            for(int g=0;g<n;g++){
                System.out.print(z[k][g]+ " ");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------------");
        //}
        */
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
        System.out.println("Колисечтво итераций = " + count);
        long end = Runtime.getRuntime().freeMemory();
        long memoTaken = start - end;
        System.out.println("Колисечтво памяти = " + memoTaken);
    }
}


