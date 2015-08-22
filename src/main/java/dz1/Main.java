package main.java.dz1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Car("Car"));
        list.add(new Bus("Bus"));
        list.add(new Plane("Plane"));
        list.add(new Submarine("Submarine"));

        for (Vehicle vehicle : list) {
            System.out.println(vehicle);
        }

    }
}
