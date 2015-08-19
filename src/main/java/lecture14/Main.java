package main.java.lecture14;

public class Main {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle(5, 5);
////        Figure figure = null;
//        System.out.println("Площадь треугольника равна - "  + triangle.toString()+ triangle.area());

        Figure figure = new Circle(25);
        double sqCircle = figure.area();
        System.out.println("Figure" + figure.toString() + " " + sqCircle);




//        Triangle triangle = new Triangle();

//        Square square = new Square();
//        System.out.println("Площадь квадрата равна " + square.area(10, 8));
//
//        Circle circle = new Circle(5);
//        System.out.println("Площадь круга равна " + circle.area());
    }

}
