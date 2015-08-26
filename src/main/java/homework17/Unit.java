package homework17;

import java.util.Random;

/**
 * Created by Ivan on 25.08.2015.
 */
public abstract class Unit {
    private int MAX_VALUE = 1000;

    private String type;
    private int power;


    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int initQuantity(){
        return new Random().nextInt(MAX_VALUE);
    }
}
