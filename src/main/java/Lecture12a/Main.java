package Lecture12a;

import static java.lang.String.valueOf;

/**
 * Created by roman on 28.07.15.
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<String>();
        list.add("1");
//        list.add("2");
//        list.add("3");
           for (int i = 0; i <10 ; i++) {
                list.add(valueOf(i));
            }
        list.add(2,"12");

//
//        System.out.println(list.findElement("2"));
        for (int i = 0; i < 11; i++) {
            System.out.println("[" + i + "] ="+list.getElement(i));
        }

    }
}
