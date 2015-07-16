package lecture3;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 01.07.2015.
 */
public class Main {
    public static void main(String[] args) {

        Rozetka TrOne = new Rozetka();
        Styles TrTwo = new Styles();
        new Main().TransactionOne(TrOne);
        new Main().TransactionTwo(TrTwo);
    }

    public void TransactionOne (InetStore inetStore) {
        inetStore.Order("Ноутбук HP заказан в магазине Rozetka");
        inetStore.Buy(18956);
    }

    public static <T extends Styles> void TransactionTwo(T o) {
        o.Order("Мобильный телефон LG заказан в магазине Styles");
        o.Buy(8999);
    }
}
