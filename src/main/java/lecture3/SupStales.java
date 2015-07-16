package lecture3;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 01.07.2015.
 */
public class SupStales extends Styles implements ConfigStore{

    @Override
    public void ConfigProd() {
        System.out.println("Была заказана дополнительная обция по установке антивирусника Eset Nod32");
    }

}
