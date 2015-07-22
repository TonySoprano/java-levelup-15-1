package Lecture11.Part2;

/**
 * Created by java on 22.07.2015.
 */
public class Conteiner <T> {
    private T[] conteiner = new T[10];
    private int i =0;

    public T[] getConteiner(int index) {
        return (T[]) conteiner[index];
    }

    public void setConteiner(T conteiner) {
        this.conteiner [i++] = conteiner;
    }
}
