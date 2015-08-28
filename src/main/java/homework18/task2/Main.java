package homework18.task2;

import java.util.*;

/**
 * Created by Ivan on 28.08.2015.
 */
public class Main {
    public static void main(String[] args) {

       //Queue
        System.out.println("Queue");
        Queue<Doc> queue = new LinkedList<Doc>();

        queue.add(new Doc("Invoice", 3 , new GregorianCalendar(2013, 11, 25)));
        queue.add(new Doc("Invoice", 2 , new GregorianCalendar(2013, 11, 30)));
        queue.add(new Doc("Invoice", 4, new GregorianCalendar(2014, 01, 25)));
        queue.add(new Doc("Invoice", 1 , new GregorianCalendar(2013, 11, 25)));
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        //PriorityQueue
        System.out.println("PriorityQueue");
        PriorityQueue<Doc> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Doc("Invoice", 1 , new GregorianCalendar(2013, 8, 10)));
        priorityQueue.add(new Doc("Invoice", 3 , new GregorianCalendar(2013, 8, 19)));
        priorityQueue.add(new Doc("Invoice", 2 , new GregorianCalendar(2013, 8, 18)));
        priorityQueue.add(new Doc("Invoice", 4, new GregorianCalendar(2014, 8, 25)));

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
