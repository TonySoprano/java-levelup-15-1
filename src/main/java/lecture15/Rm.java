package lecture15;

/**
 * Created by Ivan Moskalchenko on 15.08.2015.
 */
public class Rm implements CommandResolver {
    @Override
    public boolean isWorks(String name) {
        if(name.equals("rm")){
            return true;
        }
        return false;
    }

    @Override
    public String ExecuteCommand(String [] parts) {
        return null;
    }
}
