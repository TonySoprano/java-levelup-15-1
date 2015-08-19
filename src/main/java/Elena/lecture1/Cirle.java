package Elena.lecture1;

/**
 * Created by Oleg Knyazev
 * on 19.08.2015.
 */
public class Cirle extends Figure {
    public int R;
    public final double p = 3.14;

    public Cirle(int r) {
        R = r;
        this.setName("Circle");


    }

    @Override
    public double calcSqr() {
        double S= R*p;
        return S;
    }
}
