package lecture12;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class {@link lecture12.LinkedListExample}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 25.07.2015
 */
public class LinkedListExample {

    private LinkedList<String> container = new LinkedList<String>();
    private LinkedList<String> tempContainer = new LinkedList<String>();

    public void runExample() {

        System.out.println("Is empty: " + container.isEmpty());
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                container.add("value-" + i);
            }
            tempContainer.add("temp-value-" + j);
        }
        System.out.println("Is empty: " + container.isEmpty());
        System.out.println(container);
        System.out.println("size: " + container.size());
        for (int i = 0; i < container.size(); i++) {
            System.out.println("> " + container.get(i));
        }
        System.out.println("\n===================\n");
        for (String value : container) {
            System.out.println("> " + value);
        }

        container.addAll(tempContainer);
        System.out.println("concatenated: " + container);

        container.remove(2);
        System.out.println("after 2nd index remove: " + container);
        container.remove("value-3");
        System.out.println("after value-3 remove: " + container);
        container.clear();
        System.out.println("after clear: " + container);
        System.out.println("Is empty: " + container.isEmpty());
    }
}
