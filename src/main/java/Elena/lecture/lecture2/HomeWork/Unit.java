package Elena.lecture.lecture2.HomeWork;

/**
 * Created by Oleg Knyazev
 * on 22.08.2015.
 */
public abstract class Unit {
    String type;
    int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
