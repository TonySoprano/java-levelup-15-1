package timoshrnko_alexey.lacture2;

/**
 * Created by Home on 24.07.2015.
 */
public class Service {
    QuickGame quickGme = new QuickGame();

    public void quickGame(Playr forvard, int forwardSkil, Playr goalkeeper, int goalkeeperSkil, String discription){
        Game game = new Game();
        game.forward =  forvard;
        game.goalkeeper = goalkeeper;
        game.discription = discription;
        game.forwardSkil =  forwardSkil;
        game.goalkeeperSkil =  goalkeeperSkil;
        quickGme.log(game);


    }
}



