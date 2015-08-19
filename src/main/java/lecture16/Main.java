package lecture16;

import java.util.ArrayList;

/**
 * Created by Ivan Moskalchenko on 19.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> list = new ArrayList<Figure>();
        list.add(new Circle("Circle", 5.3));
        list.add(new Square("Square",30));
        list.add(new Triangle("Triangle", 30,23));

        for (Figure figure : list){
            System.out.println(figure);
        }
    }

}
