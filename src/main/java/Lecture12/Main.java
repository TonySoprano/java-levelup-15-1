package Lecture12;

import java.util.LinkedList;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * Created by roman on 28.07.15.
 */
public class Main {
    public static void main(String[] args) {
        MyList <String> list = new MyList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
            for (int i = 0; i <1000000 ; i++) {
                list.add(valueOf(i));
            }

//
        System.out.println(list.findElement("2"));
        System.out.println(list.getElement(100000));
    }
}
