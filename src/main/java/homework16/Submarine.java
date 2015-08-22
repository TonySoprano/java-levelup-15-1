package homework16;

/**
 * Created by Ivan on 21.08.2015.
 */
public class Submarine extends Vehicle implements Movable3D {
    @Override
    public void up() {
        System.out.println("Go up by Submarine!");
    }

    @Override
    public void down() {
        System.out.println("Go down by Submarine!");
    }


}
