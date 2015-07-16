package lecture4;

import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 04.07.2015.
 */
public class Main {

    static int rowArr = 19;
    static int min = 10;
    static int max = 56;

    public static void main(String[] args) {

        int[] arr = new int[rowArr];

        for (int i = 0; i <arr.length; i++ ) {
            arr[i] = new Random().nextInt(max - min + 1) + min;
        }
        System.out.println(Arrays.toString(arr));

        for (int row = 0; row < arr.length; row++) {
            for (int col = arr.length-2; col >= row; col--) {
                if (arr[col] > arr[col+1]) {
                    int temp = arr[col];
                    arr[col] = arr[col+1];
                    arr[col+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
