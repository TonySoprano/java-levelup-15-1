package lecture11;

/**
 * Created by Oleg Knyazev
 * on 22.07.2015.
 */
public class Container {
    private Object[] container = new Object[10];
    private int i = 0;


    public Object get(int index) {
        return container[index];
    }

}
