package lecture10;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 18.07.2015.
 */
public class Main {

    public static void main(String[] args) {
        for (int i =0; i < 5; i++) {
            new Counter();
        }
        System.out.println(Counter.getCount());
    }
}
