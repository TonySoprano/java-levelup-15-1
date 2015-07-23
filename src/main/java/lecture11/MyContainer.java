package lecture11;

/**
 * Created by Ivan on 23.07.2015.
 */
public class MyContainer<T> {
    private T[] myContainer ;
    private int sizeOfArray = 10;
    private int currentIndex = 0;

    public T getValue(int index){
        return myContainer[index];
    }

    private T[] increaseArray(){
        Integer[] tempArray = new T[sizeOfArray*2];
        return tempArray;
    }

    public void add(T value){
        if (currentIndex == myContainer.length-1){
            //need to increase the size
        }

        myContainer[currentIndex++] = value;
    }
}
