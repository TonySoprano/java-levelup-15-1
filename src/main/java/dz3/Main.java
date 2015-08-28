package main.java.dz3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("sbit", "Masha");
//        map.put("sbit", "Misha");
//        map.put("sbit", "Roma");
        map.put("urist", "Petr");
        map.put("snab", "Ivan");
//        map.put("snab", "Vova");
//        map.put("snab", "Liza");
        map.put("proizv", "Vasya");
        map.put("otk", "Genya");
//        map.put("otk", "Petr");
//        map.put("otk", "Lena");
//        map.put("otk", "Roma");

        for (Map.Entry<String, String> list : map.entrySet())
        {
            String key = list.getKey();
            String value = list.getValue();
            System.out.println(key + " : " + value);
        }
        for( Map.Entry<String, String> entry : map.entrySet() )
            if( "otk".equals( entry.getKey() ) )
                entry.setValue( "UVOLEN" );

        System.out.println(map);

    }
}

