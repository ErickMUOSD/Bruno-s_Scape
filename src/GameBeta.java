
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameBeta  extends Game{
    protected Stage mainStage;

    public void create() {
        mainStage = new Stage();
        initialize();
    }

    public void initialize() {

    }

    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        mainStage.act(dt);

        update(dt);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mainStage.draw();


    }
     public  void update(float dt){

     }
}

