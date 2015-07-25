package Lecture4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Artem on 07.07.2015.
 */
public class Main3 {
    public static int len;
    public static int min; // Минимальная граница рандомной генерации
    public static int max; // максимальное число для гранцы генерации случайных чисел

    public static void main(String[] args) {
        //Размерность длинны массива
        Scanner scannerLen = new Scanner(System.in);
        System.out.print("Input length of the array:");
        len = scannerLen.nextInt();
        //Нижняя граница для генраци псевдослучайного числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the min random:");
        min = scanner.nextInt();
        //Максимальная граница для генраци псевдослучайного числа
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Input the max random:");
        max = scanner2.nextInt();
        int[] arrayList = new int[len]; // Инициализируем массив величиной в len элементов с типом элемента int
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new Random().nextInt(max - min + 1) + min; // заполняем случацными числами до 10
        }
        //Выводим заполненный массив
        System.out.println("Выводим не отсортированный массив");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }
        //Сортирока массива
        for (int j = arrayList.length; j > 1; j--) {
            //Сортировка одного элемента массива
            for (int i = 0; i < j - 1; i++) {
                int firstElement;
                if (arrayList[i] > arrayList[i + 1]) {
                    firstElement = arrayList[i];
                    arrayList[i] = arrayList[i + 1];
                    arrayList[i + 1] = firstElement;
                }
            }
        }
        //Выводим отсортированный массив
        System.out.println("");
        System.out.println("Выводим отсортированный массив");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }
    }
}
