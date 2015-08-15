package lecture15;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ivan Moskalchenko on 15.08.2015.
 */
public interface CommandResolver {
    public boolean isWorks(String name);

    public String ExecuteCommand(String[] s) throws IOException;


}
