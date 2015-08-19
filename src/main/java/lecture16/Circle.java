package lecture16;

/**
 * Created by Ivan Moskalchenko on 19.08.2015.
 */
public class Circle extends Figure {
    private double r;
    @Override
    public double getSquare() {
        return 3.14*Math.pow(r, 2);
    }
    Circle(String name, double r){
        this.name = name;
        this.r = r;
    }


}
