package main.java.lecture3;

public class Main {
    public static void main(String[] args) {
        Rozetka rozetka = new Rozetka();
        new Main().magaz(rozetka);

        Stylus stylus = new Stylus();
        new Main().magaz(stylus);

        SuperStylus sstylus = new SuperStylus();
        new Main().magaz(sstylus);
    }

    public void magaz(InetStore inetStore) {
        inetStore.order();
        inetStore.buy(50);
    };

    public void magaz(Stylus stylus) {
//        stylus.config();
        stylus.order();
        stylus.buy(60);
    };

}
