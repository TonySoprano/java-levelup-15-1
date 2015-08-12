package main.java.lecture13;

public class Comand<T> {
        private T[] container = (T[]) new Object[5];
        private int i = 0;

        public void addMass(T object) {
            if(i>=container.length){
                T[] temp =container;
                container = (T[]) new Object[container.length*2];
                for (int j = 0; j <temp.length; j++) {
                    container[j] = temp[j];
                }
            }
            container[i] = object;
            i++;
        }

        public T getMass(int index) {
            return container[index];
        }

        public void delMass() {
            for (int t = 0; t < container.length; t++) {
                container[t] = null;
            }
            i = 0;
        }
}
