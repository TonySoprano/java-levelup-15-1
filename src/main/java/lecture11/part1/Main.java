package main.java.lecture11.part1;

import main.java.lecture11.part1.Container;

//Ќаписать контейнер, в котором значени€ будут хранитс€ в массиве.
// ” контейнера должен быть функционал - добавление, получение по индексу, очистка.

public class Main {
    public static Container arr = new Container();
    public static void main(String[] args) {
        arr.addMass(1);
        arr.addMass(1.2);
        arr.addMass("asdasd");
        arr.addMass("asdasd");
        arr.addMass("asdasd");
        arr.addMass("asdasd");
        arr.addMass("asdasd");
        arr.addMass("asdasd");
        arr.addMass(new Object());
        Object user = (Object) arr.getMass(3);
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.getMass(i));
        }
        arr.delMass();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.getMass(i));
        }
    }
}
