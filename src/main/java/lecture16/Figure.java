package lecture16;

/**
 * Created by Ivan Moskalchenko on 19.08.2015.
 */
public abstract class Figure {
    protected String name;
    public abstract double getSquare();

    public String toString() {
        return this.name + "{" +
                "Square = " + this.getSquare()+
                '}';
    }
}
