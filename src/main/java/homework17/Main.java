package homework17;


import java.util.HashMap;

/**
 * Created by Ivan on 25.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setType("Abrams");
        tank.setPower(tank.initQuantity());

        Artillery artillery = new Artillery();
        artillery.setType("Rapira");
        artillery.setPower(artillery.initQuantity());

       // HashMap<String, Integer> map = new HashMap<String, Integer>();
        //map.put(tank.getType(), tank.initQuantity()*tank.getPower());


    }
}
