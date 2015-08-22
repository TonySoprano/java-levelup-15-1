package main.java.dz1;


public class Car extends Vehicle implements Movable {

    @Override
    public String power() {
        return "power 100";
    }

    @Override
    public String carrying() {
        return "carrying 1000";
    }

    @Override
    public String back() {
        return "back 10";
    }

    @Override
    public String stop() {
        return "stop";
    }

    @Override
    public String forward() {
        return "forward 10";
    }

    @Override
    public String left() {
        return "left 10";
    }

    @Override
    public String right() {
        return "right 10";
    }

    public Car(String name) {
        this.name = name;
    }
}
