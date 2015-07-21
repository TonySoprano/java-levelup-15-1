package lecture4;


import java.util.Scanner;

/**
 * Created project java-levelup-15-1
 * by Oleg Knyazev on 21.07.2015.
 */
public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer[] Array = new Integer[8];
        System.out.println(" incipient array: ");
        for (int i=0; i<8;i++)
        {
            System.out.println("Please enter the numbers in array [" + i +"]"+" = " );
            Array[i]=scanner.nextInt();

        }

        System.out.println(" sorted array: ");

        for(int i=0;i<Array.length-1;i++){
            for(int j=i+1;j<Array.length;j++){
                if(Array[i]>Array[j]){
                    int tmp=Array[i];
                    Array[i]=Array[j];
                    Array[j]=tmp;
                }
            }
        }

        for (int i=0; i<8;i++)
        {
            System.out.println("array [" + i +"]"+" = " + Array[i] );
        }
    }

}
