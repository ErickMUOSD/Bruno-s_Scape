import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
public class Turtle extends BaseActor {
private int cont;
    public Turtle(float x, float y, Stage s)
    {
        super(x,y,s);
        String[] filenames =
                {"assets/turtle-1.png", "assets/turtle-2.png", "assets/turtle-3.png",
                        "assets/turtle-4.png", "assets/turtle-5.png", "assets/turtle-6.png"};
        loadAnimationFromFiles(filenames, 0.1f, true);
        setAcceleration(300);
        setMaxSpeed(300);
        setDeceleration(200);
        setBoundaryPolygon(8);
        cont = 0;
    }
    public void act(float dt)
    {

        super.act( dt );
      /*  if((Gdx.input.isKeyPressed(Keys.LEFT))|| (Gdx.input.isKeyPressed(Keys.RIGHT)) ||(Gdx.input.isKeyPressed(Keys.UP)) || (Gdx.input.isKeyPressed(Keys.DOWN))){
        System.out.println("workd");
               }*/
        if (Gdx.input.isKeyPressed(Keys.LEFT))
            accelerateAtAngle(180);
        if (Gdx.input.isKeyPressed(Keys.RIGHT))
            accelerateAtAngle(0);
        if (Gdx.input.isKeyPressed(Keys.UP))
            accelerateAtAngle(90);
        if (Gdx.input.isKeyPressed(Keys.DOWN))
            accelerateAtAngle(270);
        applyPhysics(dt);
        setAnimationPaused( !isMoving() );

        if ( getSpeed() > 0 )
            setRotation( getMotionAngle() );

        boundToWorld();
    }
}
