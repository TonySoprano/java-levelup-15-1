package lecture11;

import java.util.Arrays;

/**
 * Class {@link lecture11.MainPart1}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 22.07.2015
 */
public class MainPart1 {

    public static void main(String[] args) {
        MainPart1 main = new MainPart1();
        String[] array = {"asdasd", "asdasd", "asdasd"};
        main.test(1);
    }

    void test(Integer arg2, String... args) {
        System.out.println(Arrays.toString(args));
    }
}
