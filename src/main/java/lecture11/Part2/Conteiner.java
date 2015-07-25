package Lecture11.Part2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by java on 22.07.2015.
 */
public class Conteiner <T> {
    private T[] conteiner = (T[]) new Object[3] ;
    private int i =0;

    public T getConteiner(int index) {

        return  conteiner[index];

    }

    public void setConteiner(T conteiner) {
        if(i>=this.conteiner.length){
            T[] temp = this.conteiner;
            this.conteiner = (T[]) new Objects[this.conteiner.length*2];
            this.conteiner = Arrays.copyOf(temp,temp.length);
            System.out.println(this.conteiner);
            this.conteiner [i++] = conteiner;
        }else{
            this.conteiner [i++] = conteiner;
        }
    }
}
