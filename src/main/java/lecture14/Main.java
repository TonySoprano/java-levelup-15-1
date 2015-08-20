package main.java.lecture14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> list = new ArrayList<Figure>();
        list.add(new Circle("circle", 10));
        list.add(new Square("square", 10, 20));
        list.add(new Triangle("triangle", 10, 20));

        for (Figure figure : list) {
            System.out.println(figure);
        }
    }
}
