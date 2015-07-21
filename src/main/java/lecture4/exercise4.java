package lecture4;


import java.util.Scanner;

/**
 * Created project java-levelup-15-1
 * by Oleg Knyazev on 21.07.2015.
 */
public class exercise4 {
    public static void main(String[] args) {
        int n=3;
        int m=3;

        Scanner scanner=new Scanner(System.in);
        Integer[][] array = new Integer[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Please enter the numbers in array [" + i +"]"+" = " );
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("incipient array:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("sorted array:");

        for (int c = 0; c <= (n * m); c++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + 1 != n) && (j + 1 != m)) {
                        if (array[i][j] > array[i][j + 1]) {
                            int temp = array[i][j];
                            array[i][j] = array[i][j + 1];
                            array[i][j + 1] = temp;
                        }
                        if (array[i + 1][0] < array[i][m - 1]) {
                            int temp = array[i + 1][0];
                            array[i + 1][0] = array[i][m - 1];
                            array[i][m - 1] = temp;
                        }
                        if (array[n - 1][j] > array[n - 1][j + 1]) {
                            int temp = array[n - 1][j];
                            array[n - 1][j] = array[n - 1][j + 1];
                            array[n - 1][j + 1] = temp;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
