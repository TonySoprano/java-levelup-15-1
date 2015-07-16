package lessons2;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 27.06.2015.
 */
public class Transaction {

    public void chek (Deal deal) {

        if (deal.price > 0 && deal.quantity > 0) {
            Logger.log(deal);
        } else {
            System.out.println("Не верно указаны параметры сделки! Проверьте цену и кол-во товара.");
        }
    }
}
