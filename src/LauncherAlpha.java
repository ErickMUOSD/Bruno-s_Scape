import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class LauncherAlpha {
    public static void main(String[] args) {
        Game MyGame = new StarfishCollectorAlpha();
        LwjglApplication launcher =
                new LwjglApplication(MyGame, "StarfishColectorAlpha",800,600);
    }
    }
