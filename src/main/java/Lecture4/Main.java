package Lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
            System.out.println("Enter task number");
            System.out.println("from 1 till 4");
            BufferedReader chitalka = new BufferedReader(new InputStreamReader(System.in));
            Integer n = Integer.parseInt(chitalka.readLine());
        if (1 == n){
            int dlina = 15, max = 90, min = 10;
            int arr[] = new int[dlina];

            System.out.println("The unsorted arrray is: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(max - min) + min;
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }
            }

            System.out.println("the sorted one is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }

        if (2 == n){
            System.out.println("Enter the lenght of the array, min and max element");
            BufferedReader chitalka1 = new BufferedReader(new InputStreamReader(System.in));
            int dlina = Integer.parseInt(chitalka1.readLine());
            int max = Integer.parseInt(chitalka1.readLine());
            int min = Integer.parseInt(chitalka1.readLine());
            int arr[] = new int[dlina];

            System.out.println("The unsorted arrray is: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(max - min) + min;
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }
            }

            System.out.println("the sorted one is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        if (3 == n){
            int dlina = 7, shirina = 8, max = 200, min = 101, k = 0;
            int arr[][] = new int[shirina][dlina];
            int arro[] = new int[shirina * dlina];

            System.out.println("The new array is: ");

                for (int i = 0; i < shirina ; i++) {
                    for (int j = 0; j < dlina ; j++) {
                        arr[i][j] = new Random().nextInt(max - min) + min;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();

                }
                System.out.println();


            // transfer to simple array

             // transfer to simple array
                for (int i = 0; i < shirina ; i++) {
                    for (int j = 0; j < dlina ; j++) {
                        arro[k] = arr[i][j];
                        k++;
                    }
                }
                // sorting an array
                for (int i = 0; i < (shirina*dlina-1); i++) {
                    for (int j = 0; j < (shirina*dlina-1); j++) {
                        if (arro[j] > arro[j + 1]) {
                            int swap = arro[j];
                            arro[j] = arro[j + 1];
                            arro[j + 1] = swap;
                        }
                    }
                }
                // transfer to complex array
                k=0;
                for (int i = 0; i < shirina; i++) {
                    for (int j = 0; j < dlina; j++) {
                        arr[i][j] = arro[k];
                        k++;
                    }
                }

                System.out.println("The sorted array is: ");
                for (int i = 0; i < shirina ; i++) {
                    for (int j = 0; j < dlina; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        if (4 == n){

            System.out.println("Enter the lenght, width of the array, max and min element of the array");
            BufferedReader chitalka2 = new BufferedReader(new InputStreamReader(System.in));
            int dlina = Integer.parseInt(chitalka2.readLine());
            int shirina = Integer.parseInt(chitalka2.readLine());
            int max = Integer.parseInt(chitalka2.readLine());
            int min = Integer.parseInt(chitalka2.readLine());

            int k = 0;
            int arr[][] = new int[shirina][dlina];
            int arro[] = new int[shirina * dlina];

            System.out.println("The new array is: ");

            for (int i = 0; i < shirina ; i++) {
                for (int j = 0; j < dlina ; j++) {
                    arr[i][j] = new Random().nextInt(max - min) + min;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println();


            // transfer to simple array

            // transfer to simple array
            for (int i = 0; i < shirina ; i++) {
                for (int j = 0; j < dlina ; j++) {
                    arro[k] = arr[i][j];
                    k++;
                }
            }
            // sorting an array
            for (int i = 0; i < (shirina*dlina-1); i++) {
                for (int j = 0; j < (shirina*dlina-1); j++) {
                    if (arro[j] > arro[j + 1]) {
                        int swap = arro[j];
                        arro[j] = arro[j + 1];
                        arro[j + 1] = swap;
                    }
                }
            }
            // transfer to complex array
            k=0;
            for (int i = 0; i < shirina; i++) {
                for (int j = 0; j < dlina; j++) {
                    arr[i][j] = arro[k];
                    k++;
                }
            }

            System.out.println("The sorted array is: ");
            for (int i = 0; i < shirina ; i++) {
                for (int j = 0; j < dlina; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}