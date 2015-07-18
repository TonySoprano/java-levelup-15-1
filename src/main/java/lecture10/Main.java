package lecture10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by java on 18.07.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of objects to create:5");
        Integer number = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < number; i++) {
            new Test();
        }
        System.out.println("Created " + Test.getCounter() + " objects");
    }
}
