package main.java.lecture11.part2;

public class GoodContainer<T> {


    private T[] container;
    private int i = 0;

    public void addMass(T object) {
        container = (T[]) new Object[10];
//        container = (T[]) new Object[i];
//        T[] container = (T[]) new Object[i++];
//        container[i] = object;
//        i++;
//       return i++;
    }

    public T[] getMass(int index) {

        return (T[]) container[index];
    }

//    public void addMass(T container) {
//        this.container[i++] = container;
//    }

    public void delMass() {
        for (int t = 0; t < container.length; t++) {
            container[t] = null;
        }
        i = 0;
    }
}
