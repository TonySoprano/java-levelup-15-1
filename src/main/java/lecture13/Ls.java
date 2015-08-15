package main.java.lecture13;


public class Ls implements Comand {
    @Override
    public void comand(String s, String t) {
        System.out.println("Отображение = " + s);
    }
}

