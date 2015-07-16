package lecture3;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 01.07.2015.
 */
public class Rozetka implements InetStore, ConfigStore {

    @Override
    public void Order(String str) {
        System.out.println(str);
    }

    @Override
    public void Buy(Integer price) {
        System.out.println("Оплата на сайте Rozetka прошла успешно на сумму " + price + " UAH");
    }

    @Override
    public void ConfigProd() {
        System.out.println("Была заказана дополнительная обция по установке оперативной системы Windows 8");
    }
}
