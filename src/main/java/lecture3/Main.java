package lecture3;

/**
 * Created by Oleg Knyazev
 * on 01.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        Stilus stilus = new Stilus();
        new Main().store(stilus);

        Rozetka rozetka = new Rozetka();
        new Main().store(rozetka);

        SuperStilus superStilus = new SuperStilus();
        new Main().store(superStilus);
    }


    public  void store(InetStore inetStore){
        inetStore.buy(20);
        inetStore.Oder();

    }
    public void store(Stilus stilus){
        stilus.Oder();
        stilus.buy(40);
    }
}
