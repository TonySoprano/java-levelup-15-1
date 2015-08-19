package main.java.lecture14;


public class Square extends Figure {
    public double a;
    public double b;

    @Override
    public double area() {
        return a * b;
    }

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

}