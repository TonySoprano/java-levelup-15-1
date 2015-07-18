package main.java.lecture4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк массива A - ");
        int n = scanner.nextInt();
        System.out.print("Введите число столбцов массива A - ");
        int m = scanner.nextInt();
        System.out.print("Введите min - ");
        int N = scanner.nextInt();
        System.out.print("Введите max - ");
        int M = scanner.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = N + (int) (Math.random() * ((M - N) + 1));  //Min + (int)(Math.random() * ((Max - Min) + 1))
                System.out.print("A[" + i + "][" + j + "] = " + arr[i][j] + "  ");
            }
            System.out.println();
        }
        //Сортировка
        for (int c = 0; c <= (n * m); c++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + 1 != n) && (j + 1 != m)) {
                        if (arr[i][j] > arr[i][j + 1]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][j + 1];
                            arr[i][j + 1] = temp;
                        }
                        if (arr[i + 1][0] < arr[i][m - 1]) {
                            int temp = arr[i + 1][0];
                            arr[i + 1][0] = arr[i][m - 1];
                            arr[i][m - 1] = temp;
                        }
                        if (arr[n - 1][j] > arr[n - 1][j + 1]) {
                            int temp = arr[n - 1][j];
                            arr[n - 1][j] = arr[n - 1][j + 1];
                            arr[n - 1][j + 1] = temp;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println("Новый массив С:");
        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[k].length; j++) {
                System.out.print("C[" + k + "][" + j + "] = " + arr[k][j] + "  ");
            }
            System.out.println();
        }
    }
}


