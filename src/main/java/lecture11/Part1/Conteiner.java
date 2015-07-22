package Lecture11.Part1;

import java.util.Objects;

/**
 * Created by java on 22.07.2015.
 */
public class Conteiner {

    Object[] conteiner = new Object[10];
    private int i = 0;

    public void setObject(Object object) {
        conteiner[i++] = object;
    }

    public Object getObject(int index){
        return conteiner[index];
    }
    public void delObject(){
        conteiner = new Object[10];
    }
}
