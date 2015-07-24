package timoshrnko_alexey.lacture2;



/**
 * Created by Home on 17.07.2015.
 */

import java.util.Random;

public class main {

    public static void main(String[] args) {
        Playr forvard = new Playr();
        forvard.name = "Lena";
        forvard.lastName = "Golovach";
        forvard.age = "25";
        forvard.sex = "female";
        int forwardSkil = 1 + (int) (Math.random() * ((10 - 9) + 1));

        Playr goalkeeper = new Playr();
        goalkeeper.name = "Tolik";
        goalkeeper.lastName = "Granzolya";
        goalkeeper.age = "21";
        goalkeeper.sex = "male";
        int goalkeeperSkil = 1 + (int) (Math.random() * ((10 - 9) + 1));

        String discription = "Penalty";

        if (forwardSkil == goalkeeperSkil){
            System.out.println("Draw");

        }

        if (forwardSkil > goalkeeperSkil) {
            System.out.println("Forvard  is winner");
        }
        else
            System.out.println("Goalkeeper is winner");


        new Service().quickGame(forvard, forwardSkil,goalkeeper, goalkeeperSkil, discription);
    }
}










