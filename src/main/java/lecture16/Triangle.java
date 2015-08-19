package lecture16;

/**
 * Created by Ivan Moskalchenko on 19.08.2015.
 */
public class Triangle extends Figure {
    private double a, h;

    @Override
    public double getSquare() {
        return 0.5*a*h;
    }


    Triangle(String name,double a, double h){
        this.a = a;
        this.h = h;
        this.name = name;
    }
}
