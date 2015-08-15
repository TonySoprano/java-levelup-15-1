package main.java.lecture13;


public class Mv implements Comand {
    @Override
    public void comand(String s, String t) {
        System.out.println("Перенос = " + t);
    }
}

