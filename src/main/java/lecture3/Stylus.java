package main.java.lecture3;

public class Stylus implements InetStore {
    @Override
    public void order() {
        System.out.println("Заказано в Stylus");
    }

    @Override
    public void buy(Integer baks) {
        System.out.println("Цена в Stylus = " + baks);
    }
//    @Override
//    public void config() {
//        System.out.println("Настройка в Stylus");
//    }

}
