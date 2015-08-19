package lecture16;

/**
 * Created by Ivan Moskalchenko on 19.08.2015.
 */
public class Square  extends Figure {
    private double a;
    @Override
    public double getSquare() {
        return Math.pow(a, 2);
    }

    Square(String name, double a){
        this.a = a;
        this.name = name;
    }
}
