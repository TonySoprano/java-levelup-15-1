/**
 * Class {@link Main}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 15.07.2015
 */
public class Main {
   private static int count;

    public static void main(String[] args) {
        Main main = new Main();
        Main main2=new Main();

        System.out.println("Main created " + count + " again" );
    }

    public Main() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Main.count = count;
    }


}
