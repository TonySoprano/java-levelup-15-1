package lecture12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Class {@link lecture12.TreeSetExample}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 25.07.2015
 */
public class TreeSetExample {
    private TreeSet<String> set = new TreeSet<String>(Comparator.<String>reverseOrder());

    public void runExample() {
        System.out.println("Is empty: " + set.isEmpty());
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.println(set.add("value-" + i) ? "added" : "not added");
            }
        }
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println("\n======================\n");
        for (String value : set) {
            System.out.println("> " + value);
        }

        System.out.println("\n======================\n");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("> " + iterator.next());
        }
        System.out.println("\n======================\n");

        System.out.println("contains value-10: " + set.contains("value-10"));
        System.out.println("contains value-9: " + set.contains("value-9"));
        set.remove("value-5");
        System.out.println("After remove value-5: " + set);
    }
}
