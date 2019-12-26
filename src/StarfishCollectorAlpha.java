import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.Game;
public class StarfishCollectorAlpha extends Game {


    private SpriteBatch batch;
    private Texture turtleTexture;
    private float turtleX;
    private float turtleY;
    private Rectangle turtleRectangle;
    private Texture StarfishTexture;
    private  float starfishX;
    private float starfishY;
    private Rectangle starfishRectangle;
    private Texture oceanTexture;
    private Texture WinMessageTexture;
    private  boolean win;
     private Texture StarfishTexture2;
     private float starfishX1;
     private float starfishY1;
 private Rectangle starfishRectangle2;

    public void create(){
      batch = new SpriteBatch();
      turtleTexture = new Texture(Gdx.files.internal("assets/assets_chapter02/turtle-1.png"));
      turtleX = 0;
      turtleY = 0;
      turtleRectangle = new Rectangle(turtleX,turtleY,turtleTexture.getWidth(), turtleTexture.getHeight());

      StarfishTexture = new Texture(Gdx.files.internal("assets/assets_chapter02/starfish.png"));
      starfishX = 380;
      starfishY = 380;
      starfishRectangle = new Rectangle(starfishX,starfishY,StarfishTexture.getWidth(),StarfishTexture.getHeight());

      StarfishTexture2 = new Texture(Gdx.files.internal("assets/assets_chapter02/starfish.png"));
       starfishX1  =200;
       starfishY1 = 200;
       starfishRectangle2 = new Rectangle(starfishX1,starfishY1,StarfishTexture2.getWidth(),StarfishTexture2.getHeight());

       oceanTexture = new Texture(Gdx.files.internal("assets/assets_chapter02/water.jpg"));
      WinMessageTexture = new Texture(Gdx.files.internal("assets/assets_chapter02/you-win.png"));
      win = false;

    }


    public  void render(){

        //check user input

        if(Gdx.input.isKeyPressed(Keys.LEFT))
            turtleX -=10;
        if(Gdx.input.isKeyPressed(Keys.RIGHT))
            turtleX+= 10;
        if(Gdx.input.isKeyPressed(Keys.UP))
            turtleY+=10;
        if(Gdx.input.isKeyPressed(Keys.DOWN))
            turtleY-=10;

        turtleRectangle.setPosition(turtleX,turtleY);

        if((turtleRectangle.overlaps(starfishRectangle))||( turtleRectangle.overlaps(starfishRectangle2)))
            win = true;


        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(oceanTexture, 0,0);
        batch.draw( turtleTexture, turtleX, turtleY);
        if(!win ){
            batch.draw(StarfishTexture2,starfishX1,starfishY1);
            batch.draw(StarfishTexture,starfishX,starfishY);
           // batch.draw( turtleTexture, turtleX, turtleY);
        }

        if(win )
            batch.draw(WinMessageTexture, 180, 180);
        batch.end();
    }
}
