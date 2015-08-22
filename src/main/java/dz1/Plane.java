package main.java.dz1;


public class Plane extends Vehicle  implements Movable3D{
    @Override
    public String up() {
        return "up";
    }

    @Override
    public String down() {
        return "down";
    }

    @Override
    public String back() {
        return "back";
    }

    @Override
    public String stop() {
        return "stop";
    }

    @Override
    public String forward() {
        return "forward";
    }

    @Override
    public String left() {
        return "left";
    }

    @Override
    public String right() {
        return "right";
    }

    public Plane(String name) {
        this.name = name;
    }
}
