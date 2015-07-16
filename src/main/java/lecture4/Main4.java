package lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 05.07.2015.
 */
public class Main4 {
    static int rowArr = 0;
    static int colArr = 0;
    static int min = 0;
    static int max = 0;

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Укажите кол-во строк массива: ");
            rowArr = Integer.parseInt(reader.readLine());
            System.out.print("Укажите кол-во столбцов массива: ");
            colArr = Integer.parseInt(reader.readLine());

            System.out.print("Укажите min значение генерации случайных чисел: ");
            min = Integer.parseInt(reader.readLine());
            System.out.print("Укажите max значение генерации случайных чисел: ");
            max = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Считать информацию не удалось");
        }

        int[][] arr = new int[rowArr][colArr];

        for (int i = 0; i <arr.length; i++ ) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = new Random().nextInt(max - min + 1) + min;
            }
        }

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col <arr[row].length; col++) {
                for(int nextRow = 0; nextRow <arr.length; nextRow++) {
                    for(int nextCol = 0; nextCol < arr[nextRow].length; nextCol++) {
                        if(arr[nextRow][nextCol] > arr[row][col]) {
                            int temp = arr[row][col];
                            arr[row][col] = arr[nextRow][nextCol];
                            arr[nextRow][nextCol] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("min value: " + arr[0][0]);
        System.out.println("max value: " + arr[rowArr-1][colArr-1]);
    }
}