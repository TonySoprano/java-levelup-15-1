package lecture10;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 19.07.2015.
 */
public class Counter {

    private static int count;

    public Counter () {
        counterAdd();
    }

    public void counterAdd () {
        count++;
    }

    public static int getCount() {
        return count;
    }



}
