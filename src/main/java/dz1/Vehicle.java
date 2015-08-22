package main.java.dz1;


public abstract class Vehicle {
    public String name;

    @Override
    public String toString() {
        return this.name + "\n " + this.carrying() + "\n" + this.power();
    }

    public abstract String power();


    public abstract String carrying();

}

