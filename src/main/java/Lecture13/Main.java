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
//        String fileName = enterCommand.getFileName();
//        System.out.println(enterCommand.getCommand());

        ArrayList<MyCommand> list = new ArrayList<MyCommand>();
        list.add(new Rm());
//        list.add(new Ls());
//        list.add(new Mv());
        boolean commandExist = false;
        for (int i = 0; i < list.size(); i++) {
            commandExist = list.get(i).isValid(enterCommand.getCommand());
            list.get(i).doSomething(enterCommand.getFileName());
        }
        for(MyCommand myCommand: list) {
            if(myCommand.isValid(enterCommand.getCommand())) {
                commandExist = true;
                myCommand.doSomething(enterCommand.getFileName());
                break;
            }
        }
        if(commandExist){

        }else {
            System.out.println("Command not exist.");
        }


//        list.get(0).isValid(command);
//        list.get(0).doSomething(enterCommand.getFileName());
    }
}
