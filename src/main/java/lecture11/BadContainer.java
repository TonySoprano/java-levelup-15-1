package lecture11;

/**
 * Class {@link lecture11.BadContainer}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 22.07.2015
 */
public class BadContainer {
    private Object[] container = new Object[1000];
    private int i = 0;

    public int add(Object object) {
        Object[] temp = container;
        container = new Object[2];
        container[i] = object;
        return i++;
    }

    public Object get(int index) {
        return container[index];
    }
}
