package lv.tsi.javaweb.seabattle.model;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named

public class PlayerGameContext implements Serializable{

    private Player player;
    private Game game;

    @PostConstruct  // when session is created GetGameContexi
    private void created() {

    }

    @PreDestroy // before deleting from memeory do this method
    private void destroyed() {
        System.out.println("Session is destroyed");
        game.setCancelled(true);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
