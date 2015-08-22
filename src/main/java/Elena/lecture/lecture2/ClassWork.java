package Elena.lecture.lecture2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleg Knyazev
 * on 22.08.2015.
 */
public class ClassWork {
    public static void main(String[] args) {
        Map list= new HashMap();

        list.put("1","petya");
        list.put("2","vasya");
        list.put("3","katya");
        list.put("4","vlad");
        list.put("5", "angelina");

        System.out.println(list.size());

        list.get("3");
        System.out.println(list.get("4"));

        for (Object key: list.values()){
            System.out.println("Key :" + key );
        }





    }
}
