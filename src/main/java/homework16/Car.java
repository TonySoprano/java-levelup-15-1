package homework16;

/**
 * Created by Ivan on 21.08.2015.
 */
public class Car extends Vehicle  {
    @Override
    public void back() {
        System.out.println("Go back by car!");
    }

    @Override
    public void stop() {
        System.out.println("STOP THE CAR!");
    }

    @Override
    public void forward() {
        System.out.println("Go forward!");
    }

    @Override
    public void left() {
        System.out.println("Go left by car!");
    }

    @Override
    public void right() {
        System.out.println("Go right by car!");
    }
}
