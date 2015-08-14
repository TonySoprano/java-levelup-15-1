package lecture12;

/**
 * Class {@link lecture12.Main}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 25.07.2015
 */
public class Main {

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        HashSetExample hashSetExample = new HashSetExample();
        TreeSetExample treeSetExample = new TreeSetExample();
        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();




        System.out.println("\n                ARRAY LIST\n=========================================\n");
        arrayListExample.runExample();
        System.out.println("\n                LINKED LIST\n=========================================\n");
        linkedListExample.runExample();
        System.out.println("\n                HASH SET\n=========================================\n");
        hashSetExample.runExample();
        System.out.println("\n                LINKED HASH SET\n=========================================\n");
        linkedHashSetExample.runExample();
        System.out.println("\n                TREE SET\n=========================================\n");
        treeSetExample.runExample();
    }
}
