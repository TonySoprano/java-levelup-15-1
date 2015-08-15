package lecture15;

/**
 * Created by Ivan Moskalchenko on 15.08.2015.
 */
public interface CommandResolver {
    public boolean isWorks(String name);

    public String ExecuteCommand(String[] s);


}
