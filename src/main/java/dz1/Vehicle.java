package main.java.dz1;


public abstract class Vehicle {
    public String name;

    @Override
    public String toString() {
        return this.name + " " + this.left();
    }

    public abstract String back();

    public abstract String stop();

    public abstract String up();

    public abstract String down();

    public abstract String forward();

    public abstract String left();

    public abstract String right();

}

