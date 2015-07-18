package lecture10;

/**
 * Created by php on 18.07.2015.
 */
public class A {
    private static Integer n;
    Integer a;
    A () {
    }
    A (int a) {
        this.a=a;
    }
    public static Integer getN() {
        return n;
    }
    public static void setN(Integer n) {
        A.n = n;
    }
}
