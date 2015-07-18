package lecture10;

/**
 * Created by php on 18.07.2015.
 */
public class Main {
    public static int getCount() {
        return count;
    }



    public static int count;
    public static void main(String[] args) {
        Main main1=new Main();
        Main main2=new Main();
        Main main3=new Main();
        System.out.println(count);
    }
    Main(){
        count++;
    }
    public static void setCount(int count) {
        Main.count = count;
    }
}
