package main.java.lecture14;

class Circle extends Figure {
    public double a;

    public static final double pi = 3.14;

    public Circle(String name, double a) {
        this.a = a;
        this.name = name;
    }


    @Override
    public double area() {
        return pi * Math.pow(pi, 2);
    }

}