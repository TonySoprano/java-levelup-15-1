package Lecture13;

import java.util.ArrayList;

/**
 * Created by roman on 13.08.15.
 */
public class ListCommand {


    private ArrayList<MyCommand> list = new ArrayList<MyCommand>();

    public void setList(ArrayList<MyCommand> list) {
        this.list = list;
    }

    public ArrayList<MyCommand> getList() {
        return list;
    }
}

