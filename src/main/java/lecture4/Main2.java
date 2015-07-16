package lecture4;

import java.util.Random;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 04.07.2015.
 */
public class Main2 {

    static int rowArr = 6;
    static int colArr = 9;
    static int min = 3;
    static int max = 73;

    public static void main(String[] args) {

        int[][] arr = new int[rowArr][colArr];

        for (int row = 0; row <arr.length; row++ ) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = new Random().nextInt(max - min + 1) + min;
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("first array print ok");

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

        for(int row = 0; row <arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("second array print ok");
    }
}
