package lecture4;

import java.util.Random;

/**
 * Created project java-levelup-15-1
 * by Oleg Knyazev on 21.07.2015.
 */
public class exercise1 {
    public static void main(String[] args) {
        Random znach = new Random();
        Integer[] Array = new Integer[8];
        System.out.println(" incipient array: ");
        for (int i=0; i<8;i++)
        {
            Array[i]=znach.nextInt(30);
            System.out.println("array [" + i +"]"+" = " + Array[i] );
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
