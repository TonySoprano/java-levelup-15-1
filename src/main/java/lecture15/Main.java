package lecture15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Moskalchenko on 15.08.2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        List<CommandResolver> list = new ArrayList<CommandResolver>();
        list.add(new Ls());
        list.add(new Mv());
        list.add(new Rm());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] parts = s.split(" ");

        for (CommandResolver cr : list) {

            if (cr.isWorks(parts[0])){
                cr.ExecuteCommand(parts);
            }
        }

    }




}
