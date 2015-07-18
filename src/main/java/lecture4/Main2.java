package main.java.lecture4;

public class Main2 {
    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        int arr[][] = new int[n][m];
        int N = 5;
        int M = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = N + (int) (Math.random() * ((M - N) + 1));  //Min + (int)(Math.random() * ((Max - Min) + 1))
                System.out.print("A[" + i + "][" + j + "] = " + arr[i][j] + "  ");
            }
            System.out.println();
        }
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
        for (int t = 0; t < arr.length; t++) {
            for (int j = 0; j < arr[t].length; j++) {
                System.out.print("C[" + t + "][" + j + "] = " + arr[t][j] + "  ");
            }
            System.out.println();
        }
    }
}

