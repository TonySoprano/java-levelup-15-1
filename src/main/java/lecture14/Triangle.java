package main.java.lecture14;

class Triangle extends Figure {
    public double a;
    public double b;

    public Triangle(String name, double a, double b) {
        this.a = a;
        this.b = b;
        this.name = name;
    }


    @Override
    public double area() {
        return a * b / 2;
    }
}