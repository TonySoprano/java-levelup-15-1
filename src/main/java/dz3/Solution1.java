package main.java.dz3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(String.valueOf(new Sbit("Ivan Petrovich1", true, 55, "sbit", 16546984)));
        list.add(String.valueOf(new Sbit("Ivan Petrovich2", true, 56, "sbit", 54889164)));
        list.add(String.valueOf(new Sbit("Ivan Petrovich3", true, 57, "sbit", 56496498)));
        list.add(String.valueOf(new Sbit("Ivan Petrovich4", true, 58, "sbit", 16542164)));
        list.add(String.valueOf(new Sbit("Ivan Petrovich5", true, 59, "sbit", 65496544)));

        Map<String, ArrayList<String>> people = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < 5; i++) {
            people.put("sbit", list);
//            people.put("snab" + i, "Ivan Ivanovich, " + i * 4);
//            people.put("otk" + i, "Ivan Aleksandrovich, " + i * 6);
        }


        for (Map.Entry<String, ArrayList<String>> s : people.entrySet()) {
            if (s.getKey().equals("sbit")) {
                for(String d : list) {
                    System.out.println(d + s.getKey() + " " + s.getValue());
                }
            }
        }
    }
}
