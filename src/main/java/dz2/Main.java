package main.java.dz2;


public class Main {
    public static void main(String[] args) {
        Tanks tank = new Tanks();
        tank.setType("Pantera");
        tank.setPower(tank.initQuantity());
        Artillery artillery = new Artillery();
        artillery.setType("Gaubitsa");
        artillery.setPower(artillery.initQuantity());
        System.out.println("" + artillery.calculatePower());
    }
}
