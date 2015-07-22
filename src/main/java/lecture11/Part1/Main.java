package Lecture11.Part1;

/**
 * Created by java on 22.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        Conteiner conteiner = new Conteiner();

        conteiner.setObject("sdfsdf");
        conteiner.setObject(1);
        conteiner.setObject(2);
        conteiner.setObject(1.5);

        System.out.println(conteiner.getObject(3));

        conteiner.delObject();
        System.out.println(conteiner.getObject(3));
    }
}
