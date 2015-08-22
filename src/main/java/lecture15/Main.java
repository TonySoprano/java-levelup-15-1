package main.java.lecture15;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Mama");
        map.put("2", "Mila");
        map.put("3", "Ramu");

        for (Map.Entry<String, String> list : map.entrySet())
        {
            String key = list.getKey();
            String value = list.getValue();
            System.out.println(key + " : " + value);
        }
        for( Map.Entry<String, String> entry : map.entrySet() )
            if( "2".equals( entry.getKey() ) )
                entry.setValue( "NE mila" );

        System.out.println(map);

    }
}

