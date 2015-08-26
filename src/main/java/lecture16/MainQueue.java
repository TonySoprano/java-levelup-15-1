package main.java.lecture16;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if( o1 > o2 ){  // изменение вывода
                    return -1;
                }
                if( o1 < o2 ){  // изменение вывода
                    return 1;
                }
                return 0;
            }
        };
        Queue<Integer> intQueue = new PriorityQueue<>(10, comparator);
        intQueue.add(4);
        intQueue.add(3);
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(7);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(8);
        intQueue.add(0);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.remove());
        }


    }
}
