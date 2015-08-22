package homework16;

/**
 * Created by Ivan on 21.08.2015.
 */
public class Plane extends Vehicle implements Movable3D {
    @Override
    public void up() {
        System.out.println("Go up by plane!");
    }

    @Override
    public void down() {
        System.out.println("Go down by plane!");
    }


}
