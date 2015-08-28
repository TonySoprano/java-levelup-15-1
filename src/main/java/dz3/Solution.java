package main.java.dz3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> people = new HashMap<String, String>();
        for (int i = 0; i < 5; i++) {
            people.put("sbit" + i, "Ivan Petrovich, " + i*2);
            people.put("urist" + i, "Ivan Vasilevich, " + i*3);
            people.put("snab" + i, "Ivan Ivanovich, " + i*4);
            people.put("proizv" + i, "Ivan Vladimirovich, "+ i*5);
            people.put("otk" + i, "Ivan Aleksandrovich, " + i*6);
        }
        return  (HashMap<String, String>) people;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        System.out.println("-----sbit-----");
        for (Map.Entry<String, String> s : map.entrySet())
        {
            if(s.getKey().contains("sbit")) System.out.println(s.getKey() + " " + s.getValue());
        }
        System.out.println("-----snab-----");
        for (Map.Entry<String, String> s : map.entrySet())
        {
            if(s.getKey().contains("snab")) System.out.println(s.getKey() + " " + s.getValue());
        }
        System.out.println("-----otk-----");
        for (Map.Entry<String, String> s : map.entrySet())
        {
            if(s.getKey().contains("otk")) System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}



