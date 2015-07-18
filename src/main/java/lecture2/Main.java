package main.java.lecture2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        User buyer = new User();
        buyer.name = JOptionPane.showInputDialog("Введите имя покупателя: ");
        buyer.lastName = JOptionPane.showInputDialog("Введите отчество покупателя: ");
        buyer.soName = JOptionPane.showInputDialog("Введите фамилию покупателя: ");
//        buyer.name = "Vasya";
//        buyer.lastName = "Viktorovich";
//        buyer.soName = "Voronov";
        buyer.age = Integer.parseInt(JOptionPane.showInputDialog("Введите возраст покупателя: "));


        User salesman = new User();
//        salesman.name = "Kolya";
//        salesman.lastName = "Nikolaevich";
//        salesman.soName = "Petrov";
        salesman.name = JOptionPane.showInputDialog("Введите имя продавца: ");
        salesman.lastName = JOptionPane.showInputDialog("Введите отчество продавца: ");
        salesman.soName = JOptionPane.showInputDialog("Введите фамилию продавца: ");
        salesman.age = Integer.parseInt(JOptionPane.showInputDialog("Введите возраст продавца: "));



        String description = JOptionPane.showInputDialog("Введите вид договора: ");
        String number = JOptionPane.showInputDialog("Введите номер договора: ");
        String data = JOptionPane.showInputDialog("Введите дату договора: ");
        Double price = Double.parseDouble(JOptionPane.showInputDialog("Введите сумму договора: "));

        new Service().makeDeal(buyer, salesman, description,number, data,  price);

    }

}
