package lecture2;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mazai on 27.06.2015.
 */
public class Invoice extends Document {
    public HashMap<String, Integer> productMap = new HashMap<String, Integer>();


    public void addProduct(String product, Integer quantity){
        productMap.put(product, quantity);
    }

    Invoice(Integer number, Float sum, String strAuthor){
        super(number, sum, strAuthor);
    }

    public void print(){
        System.out.println(this.toString());

        if (productMap.size() > 0 ){
            System.out.println("Product list: ");

            for (Map.Entry<String, Integer> pair : productMap.entrySet()){
                System.out.println(pair.getKey() + " - " + pair.getValue() + " шт.");
            }

        }
        System.out.println();
    }


}
