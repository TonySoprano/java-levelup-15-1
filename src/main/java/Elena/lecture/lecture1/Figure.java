package Elena.lecture.lecture1;

/**
 * Created by Oleg Knyazev
 * on 19.08.2015.
 */
public abstract class Figure {
    @Override
    public String toString() {
        return "Figure{" +
                "name=" + name + "  S = " + '\'' + calcSqr() +
                '}';
    }

    public String name;

    public abstract double calcSqr();

    public void setName(String name) {
        this.name = name;
    }
    public void getName(String name){
        this.name = name;

    }
}
