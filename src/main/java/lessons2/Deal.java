package lessons2;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 27.06.2015.
 */
public class Deal {

    public String product;
    public User buyer;
    public User salesman;
    public Integer quantity;
    public Float price;

    public Deal() {
        price = Float.valueOf(0);
        quantity = Integer.valueOf(0);
        product = null;
    }

    public Deal (User buyer, User salesman, String product, Integer quantity, Float price) {
        this.buyer = buyer;
        this.salesman = salesman;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
