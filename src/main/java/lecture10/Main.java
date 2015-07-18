package lecture10;

/**
 * Class {@link Main}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 15.07.2015
 */
public class Main {
   private static int mainAgain;

    public static void main(String[] args) {
        Main main = new Main();
        Main main2=new Main();
        Main main4=new Main();
        Main main3=new Main() ;

        System.out.println("Main created " + mainAgain + " again" );
    }

    public Main() {
        mainAgain++;
    }

    public static int getCount() {
        return mainAgain;
    }

    public static void setCount(int count) {
        Main.mainAgain = mainAgain;
    }


}
