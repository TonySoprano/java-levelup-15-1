package Elena.lecture1;

/**
 * Created by Oleg Knyazev
 * on 19.08.2015.
 */
public class Square extends Figure {

    public int a;

    public Square(int a) {
        this.a = a;
        this.setName("Square");
    }

    @Override
    public double calcSqr() {
        double S = a^2;
        return S;
    }
}
