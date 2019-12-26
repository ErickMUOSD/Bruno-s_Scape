import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
public class LauncherBeta
{
    public static void main (String[] args)
    {
        Game MyGame = new StarfishCollectorBeta();
        LwjglApplication launcher =
                new LwjglApplication( MyGame, "Starfish Collector", 800, 600 );
    }
}