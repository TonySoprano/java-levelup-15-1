package main.java.lecture2;

public class Service {
    Logger logger = new Logger();
    public  void makeDeal(User buyer, User salesman,  String description, String number, String data, Double price){
        Deal deal = new Deal();
        deal.buyer = buyer;
        deal.salesman = salesman;
        deal.price = price;
        deal.description = description;
        deal.number = number;
        deal.data = data;
        logger.log(deal);
    }
}
