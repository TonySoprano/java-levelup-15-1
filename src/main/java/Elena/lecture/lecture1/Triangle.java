package Elena.lecture.lecture1;

import Elena.lecture.lecture1.Figure;

/**
 * Created by Oleg Knyazev
 * on 19.08.2015.
 */
public class Triangle extends Figure {
    public int a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h=h;
        this.setName("Triangle");
    }

    @Override
    public double calcSqr() {
        double S = (a/2)*h;
        return S;
    }
}
