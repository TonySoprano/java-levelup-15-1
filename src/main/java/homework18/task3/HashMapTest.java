package homework18.task3;


import java.io.*;
import java.util.*;

/**
 * Created by Ivan on 27.08.2015.
 */
public class HashMapTest {


    public static String readFile(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            try {
                String s;
                while((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append(" ");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the path to the file:");
        String s = bufferedReader.readLine();

        File file = new File(s);
        if (file.exists() && !file.isDirectory()){

            List<String> arrayList = Arrays.asList(readFile(file).split(" "));
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (String str : arrayList){
                if (!map.containsKey(str)){
                    map.put(str, 1);
                } else{
                    Integer curValue = map.get(str);
                    map.put(str, ++curValue);
                }
            }
            Iterator it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry entry = (Map.Entry)it.next();
                System.out.println(entry.getKey() +
                        " // QUANTITY = " + entry.getValue());
            }
        } else{
            System.out.println("Incorrect path or filename!");
        }

    }

}
