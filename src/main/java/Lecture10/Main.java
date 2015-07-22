package Lecture10;

/**
 * Created by roman on 21.07.15.
 */
public class Main {
    public static void main(String[] args) {
        new BaseClass();
        new BaseClass();
        new BaseClass();
        new BaseClass();

        System.out.println("new obgect calls "+BaseClass.counter+" time.");
    }
}
