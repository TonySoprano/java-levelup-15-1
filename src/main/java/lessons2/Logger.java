package lessons2;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 27.06.2015.
 */
public class Logger {

    public static void log(Deal deal) {
        System.out.println("Продукт "+ deal.product + " продан в кол-ве " + deal.quantity + " штук по цене " + deal.price + " сумма транзакции составила " + deal.price*deal.quantity + " UAH" );
    }
}
