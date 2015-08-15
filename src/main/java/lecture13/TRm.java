package main.java.lecture13;

public class TRm implements Comand {
    @Override
    public void comand(String s, String t) {
            System.out.println("Удаление = " + s + t);
        }
}
