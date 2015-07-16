package lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 05.07.2015.
 */
public class Main3 {

    static int rowArr = 0;
    static int min = 0;
    static int max = 0;

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Укажите кол-во строк массива: ");
            rowArr = Integer.parseInt(reader.readLine());

            System.out.print("Укажите min значение генерации случайных чисел: ");
            min = Integer.parseInt(reader.readLine());
            System.out.print("Укажите max значение генерации случайных чисел: ");
            max = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Считать информацию не удалось");
        }

        int[] arr = new int[rowArr];

        for (int row = 0; row <arr.length; row++ ) {
            arr[row] = new Random().nextInt(max - min + 1) + min;
        }
        Arrays.sort(arr);

        System.out.println("min value: " + arr[0]);
        System.out.println("max value: " + arr[arr.length-1]);
    }
}

