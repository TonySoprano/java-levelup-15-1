package lecture3;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 01.07.2015.
 */
public class Styles implements InetStore {

    @Override
    public void Order(String str) {
        System.out.println(str);
    }

    @Override
    public void Buy(Integer price) {
        System.out.println("Оплата на сайте Styles прошла успешно на сумму " + price + " UAH");
    }
}
