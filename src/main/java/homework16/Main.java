package homework16;

import java.util.ArrayList;

/**
 * Created by Ivan on 22.08.2015.
 */
public class Main {


    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Bus());
        list.add(new Car());
        list.add(new Plane());
        list.add(new Submarine());

        for (Vehicle vehicle : list){
            System.out.println("/////////////////////////////////////////////////////");
            System.out.println(vehicle.getClass().getName());
            vehicle.back();
            vehicle.forward();
            vehicle.left();
            vehicle.right();
            vehicle.stop();

            if (vehicle instanceof Movable3D){
                ((Movable3D) vehicle).up();
                ((Movable3D) vehicle).down();
            }

        }
    }
}
