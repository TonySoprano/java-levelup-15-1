package lecture11;

import lecture3.Main;

import java.util.Arrays;

/**
 * Created by Oleg Knyazev
 * on 22.07.2015.
 */
public class MainPart1 {
    public static void main(String[] args) {
        MainPart1 main=new MainPart1();
        String[] array ={"asdasd","asdsaa","aasdads"};
        main.test(array);
    }
    void test(String...args){
        System.out.println(Arrays.toString(args));
    }
}
