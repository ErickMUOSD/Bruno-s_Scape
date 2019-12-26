
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.PropertiesUtils;

public class StarfishCollectorBeta extends GameBeta {

    private Turtle turtle;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;
    private ActorBeta shark;
    private ActorBeta gameover;

    private boolean win;
    private boolean loose;


    public void initialize() {
        ocean = new ActorBeta();
        ocean.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/water.jpg")));
        mainStage.addActor(ocean);

        starfish = new ActorBeta();
        starfish.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/starfish.png")));
        starfish.setPosition(380, 380);
        mainStage.addActor(starfish);

        turtle = new Turtle();
        turtle.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/turtle-1.png")));
        turtle.setPosition(20, 20);
        mainStage.addActor(turtle);

        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/you-win.png")));
        winMessage.setPosition(180, 180);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        shark = new ActorBeta();
        shark.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/sharky.png")));
        shark.setPosition(100,250);
        shark.setVisible(true);
        mainStage.addActor(shark);

        gameover = new ActorBeta();
        gameover.setTexture(new Texture(Gdx.files.internal("assets/assets_chapter02/game-over.png")));
        gameover.setPosition(180,180);
        gameover.setVisible(false);
        mainStage.addActor(gameover);



        win = false;
        loose = false;
    }

    public void update(float dt) {


        if (turtle.overlaps(starfish)) {
            starfish.remove();
            winMessage.setVisible(true);
        }
        if(turtle.overlaps(shark)){
            turtle.remove();
            gameover.setVisible(true);

        }

    }


}
