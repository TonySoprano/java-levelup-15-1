package Lecture11.Part2;

/**
 * Created by java on 22.07.2015.
 */
public class Main {
    public static void main(String[] args) {
    Conteiner <Integer> ob = new Conteiner<Integer>();

        ob.setConteiner(1);
        ob.setConteiner(2);
        ob.setConteiner(3);
        ob.setConteiner(4);
        ob.setConteiner(5);
        ob.setConteiner(6);


        System.out.println(ob.getConteiner(5));
//        System.out.println(ob.getConteiner(1));

    }
}
