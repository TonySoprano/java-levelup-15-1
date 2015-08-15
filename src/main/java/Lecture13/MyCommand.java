package Lecture13;

import java.util.ArrayList;

/**
 * Created by roman on 13.08.15.
 */

public interface MyCommand {

     boolean isValid(String command);


     void  doSomething(ArrayList<String> file);
}