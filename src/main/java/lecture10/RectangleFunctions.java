package lecture10;

/**
 * Class {@link RectangleFunctions}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 18.07.2015
 */
public class RectangleFunctions {
    private int a;
    private int b;
    private int c;
    private int d;

    public RectangleFunctions() {
    }

    RectangleFunctions(int a) {
        this.a = this.b = this.c = this.d = a;
    }

    RectangleFunctions(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
    }


    RectangleFunctions(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int calculatePerimeter() {
        return a + b + c + d;
    }

    public void setA(int a) {
        if (a < 0) {

        }
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
}
