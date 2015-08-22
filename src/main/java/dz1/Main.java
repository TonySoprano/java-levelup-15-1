package main.java.dz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
//        list.add(new Car("Car"));
//        list.add(new Bus("Bus"));
//        list.add(new Plane("Plane"));
//        list.add(new Submarine("Submarine"));
//
//        for (Vehicle vehicle : list) {
//            System.out.println(vehicle);
//        }

        Car vehicle1 = new Car("Car");
        System.out.println(vehicle1.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int action;
        do
        {
            System.out.println(vehicle1.name + " : введите действие:" +
                    "\n1) back\n2) stop\n3) forward\n4) left\n5) right\n0) EXIT");
            action = Integer.parseInt(reader.readLine());
        switch (action){
            case 1: System.out.println(vehicle1.name + " " + vehicle1.back());
                break;
            case 2: System.out.println(vehicle1.name + " " + vehicle1.stop());
                break;
            case 3: System.out.println(vehicle1.name + " " + vehicle1.forward());
                break;
            case 4: System.out.println(vehicle1.name + " " + vehicle1.left());
                break;
            case 5: System.out.println(vehicle1.name + " " + vehicle1.right());
                break;
            case 0:
                break;
        }
        }while (action != 0);

        Vehicle vehicle2 = new Plane("Plane");


    }
}
