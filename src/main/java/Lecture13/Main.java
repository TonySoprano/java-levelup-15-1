package Lecture13;

import java.util.ArrayList;

/**
 * Created by roman on 13.08.15.
 */
public class Main {
    public static void main(String[] args) {
        EnterCommand enterCommand = new EnterCommand();
            enterCommand.TypeSomething();
        String command = enterCommand.getCommand();
        String fileName = enterCommand.getFileName();
//        System.out.println(enterCommand.getCommand());

        ArrayList <MyCommand> list = new ArrayList<MyCommand>();
                    list.add(new Rm());

        list.get(0).isExist(command);
        list.get(0).doSomething(fileName);
    }
}
