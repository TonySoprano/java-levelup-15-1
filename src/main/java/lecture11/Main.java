package lecture11;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 22.07.2015.
 */
public class Main {

    public static void main(String[] args) {
        Container<Integer> container = new Container<Integer>();

        container.addValue(10);
        container.addValue(20);
        container.addValue(30);
        container.addValue(40);
        container.addValue(50);
        container.addValue(60);
        container.addValue(70);

        container.deleteValue(2);
        container.printValue();



    }


    


}
