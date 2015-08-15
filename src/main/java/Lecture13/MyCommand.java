package Lecture13;

/**
 * Created by roman on 13.08.15.
 */
//public class MyCommand {
//
//    public boolean isExist(String command){
//        return false;
//    }
//
//
//    public String  doSomething(){
//        return null;
//    }
//}
public interface MyCommand {

     boolean isExist(String command);


     void  doSomething(String file);
}