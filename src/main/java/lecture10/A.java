package lecture10;

/**
 * Class {@link lecture10.A}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 18.07.2015
 */
public class A {
    private static String field;

    public static String getField() {
        return field;
    }

    public static void setField(String field) {
        A.field = field;
    }
}

