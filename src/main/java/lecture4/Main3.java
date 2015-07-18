package main.java.lecture4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число элементов массива A - ");
        int a = scanner.nextInt();
        int arr[] = new int[a];
        System.out.print("Введите min - ");
        int n = scanner.nextInt();
        System.out.print("Введите max - ");
        int m = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n + (int) (Math.random() * ((m-n)+1));  //Min + (int)(Math.random() * ((Max - Min) + 1))
            System.out.println("A[" + i + "] = " + arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Новый массив С:");
        for (int k = 0; k < arr.length; ++k) {
            System.out.println("C[" + k + "] = " + arr[k]);
        }
    }
}
