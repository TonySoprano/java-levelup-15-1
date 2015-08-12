package lecture11;

/**
 * Created by Ivan on 23.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        MyContainer<Integer> myContainer = new MyContainer<Integer>();
        System.out.println("Method add:");
        for (int i = 0; i < 15; i++) {
            myContainer.add(i); 
        }
        myContainer.print();

        System.out.println("Method get:");
        System.out.println(myContainer.getValue(5));

        System.out.println("Method delete:");
        myContainer.deleteValue(2);
        myContainer.print();

        System.out.println("Method get:");
        System.out.println(myContainer.getValue(5));

        System.out.println("Method clear:");
        myContainer.clearArray();
        myContainer.print();
    }
}
