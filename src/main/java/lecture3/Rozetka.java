package main.java.lecture3;


public class Rozetka implements ConfigStore, InetStore {


    @Override
    public void config() {
        System.out.println("Настройка в Розетке");
    }

    @Override
    public void order() {
        System.out.println("Заказано в Розетке");
    }

    @Override
    public void buy(Integer baks) {
        System.out.println("Цена в Розетке = " + baks);
    }
}
