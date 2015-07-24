package timoshrnko_alexey.lacture2;

/**
 * Created by Home on 24.07.2015.
 */
public class QuickGame {

    public void log(Game game) {
        System.out.printf("Game");
        System.out.println("Goalkeeper :" + game.goalkeeper.name);
        System.out.println("Goalkeeper :" + game.goalkeeper.lastName);
        System.out.println("Goalkeeper skil level :" + game.goalkeeperSkil);
        System.out.println("Forward :" + game.forward.name);
        System.out.println("Goalkeeper :" + game.forward.lastName);
        System.out.println("Forward skil level :" + game.forwardSkil);
        System.out.println("Discription :" + game.discription);
    }
}