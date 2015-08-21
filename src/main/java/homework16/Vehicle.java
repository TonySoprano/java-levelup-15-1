package homework16;

/**
 * Created by Ivan on 21.08.2015.
 */
public abstract class Vehicle implements Movable {
    @Override
    public void back() {
        System.out.println("Go back!");
    }

    @Override
    public void stop() {
        System.out.println("STOP!");
    }

    @Override
    public void forward() {
        System.out.println("Go forward!");
    }

    @Override
    public void left() {
        System.out.println("Go left!");
    }

    @Override
    public void right() {
        System.out.println("Go right!");
    }
}
