package main.java.lecture2;

import javax.swing.*;

public class Logger {
    public void log(Deal deal) {
        JOptionPane.showMessageDialog(null, "Сделка" + "\nПокупатель: " + deal.buyer.name + " " + deal.buyer.lastName
                + " " + deal.buyer.soName + "\nВозраст: " + deal.buyer.age + "\nПродавец: " + deal.salesman.name
                + " " + deal.salesman.lastName + " " + deal.salesman.soName + "\nВозраст: " + deal.salesman.age
                + "\nДоговор: " + deal.description + " №" + deal.number + " от " + deal.data + "\nСумма договора: "
                + deal.price);

    }
}
