package lecture5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @auhtor Artem Makutskiy
 * @since 09.07.2015.
 */
public class Reader {

    public BufferedReader reader () {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return read;
    }
}
