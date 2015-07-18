package lecture2;

/**
 * Created by MIL on 27.06.2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        Invoice invoice1 = new Invoice(121, 300.50f, "Иванов");
        invoice1.addProduct("Карандаш", 10000);
        invoice1.addProduct("Ручка гелевая", 1200);

        invoice1.print();


        Waybill waybill1 = new Waybill(155, 150000.0f, "Петров");
        waybill1.setCheckPointList("Киев");
        waybill1.setCheckPointList("Львов");
        waybill1.setCheckPointList("Тернополь");
        waybill1.setCheckPointList("Киев");

        waybill1.print();

    }
}
