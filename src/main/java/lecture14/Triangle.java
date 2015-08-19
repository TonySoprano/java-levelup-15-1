package main.java.lecture14;

class Triangle extends Figure {
    public double a;
    public double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a * b / 2;
    }
}