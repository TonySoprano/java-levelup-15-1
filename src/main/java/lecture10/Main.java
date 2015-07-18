package lecture10;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 18.07.2015.
 */
public class Main {
    private static int count;

    public Main () {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        for (int i =0; i < 5; i++) {
            new Main();
        }
        System.out.println(Main.getCount());
    }
}
