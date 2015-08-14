package lecture11;

/**
 * Class {@link lecture11.GoodContainer}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 22.07.2015
 */
public class GoodContainer<T> {
    private T[] container;

    public void setField(T arg){
        container = (T[]) new Object[1];
    }

    public T[] getField() {
        return container;
    }

}
