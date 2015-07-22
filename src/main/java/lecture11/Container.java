package lecture11;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 22.07.2015.
 */
public class Container<T extends Number> {

    private T[] arr = (T[]) new Number[7];
    private int cursor;

    public T getValue(int index) {
        return arr[index];
    }

    public void addValue(T arg) {

        if (cursor >= arr.length) {
            T[] tempArr = (T[]) new Number[arr.length*2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            tempArr[cursor] = arg;
            arr = tempArr;
            cursor++;
        } else {
            arr[cursor] = arg;
            cursor++;
        }
    }

    public void cleanValue() {
        arr = (T[]) new Number[arr.length];
        cursor = 0;
    }

    public void printValue (){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void deleteValue (int delRow){
        arr[delRow] = null;
        for (int barrier = delRow; barrier < arr.length; barrier++) {
            if (barrier + 1 >= arr.length) {
                arr[arr.length -1] = null;
            } else {
                arr[barrier] = arr[barrier + 1];
            }
        }
    }
}
