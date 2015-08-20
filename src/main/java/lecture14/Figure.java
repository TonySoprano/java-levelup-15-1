package main.java.lecture14;


public abstract class Figure {

    public String name;
    @Override
    public String toString() {
        return  "Square " + this.name + " = " + this.area();
    }

    public abstract double area();

}

