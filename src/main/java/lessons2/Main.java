package lessons2;

/**
 * Created by User on 27.06.2015.
 */
public class Main {
    public static void main(String[] args) {

        User buyer = new User();
        buyer.name = "OOO Flora";

        User salesman = new User();
        salesman.name = "OOO Demetra";

        Deal deal = new Deal(buyer,salesman,"Tomato",Integer.valueOf(24),Float.valueOf((float) 7.69));

        Transaction operation = new Transaction();
        operation.chek(deal);
    }
}

