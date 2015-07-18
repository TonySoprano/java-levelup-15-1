package main.java.lecture3;

public class SuperStylus extends Stylus {
    public void config() {
        System.out.println("Настройка в SuperStilus");
    }

    public void order() {
        System.out.println("Заказано в SuperStilus");
    }

    public void buy(Integer baks) {
        System.out.println("Цена в SuperStilus = " + baks);
    }
}
