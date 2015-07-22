package lecture11;

/**
 * Created by php on 22.07.2015.
 */
public class Container {
    private Object[] container = new Object[1000];
    private int i=0;

    public int add(Object object){
        Object[] temp=container;
        container = new Object[];
        return i++;
    }

    public Object get(int index) {
        return container[index];
    }
}
