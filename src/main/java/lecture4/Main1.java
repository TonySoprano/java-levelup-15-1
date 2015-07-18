package main.java.lecture4;

public class Main1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n = 5;
        int m = 20;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n + (int) (Math.random() * ((m-n)+1));  //Min + (int)(Math.random() * ((Max - Min) + 1))
            System.out.println("A[" + i + "] = " + arr[i]);
        }
        //Сортировка пузырьком
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
        for (int k = 0; k < 10; ++k) {
            System.out.println("C[" + k + "] = " + arr[k]);
        }
    }
}

