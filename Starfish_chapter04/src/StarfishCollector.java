import com.badlogic.gdx.scenes.scene2d.actions.Actions;
public class StarfishCollector extends GameBeta {
    private Turtle turtle;
    private Starfish starfish;
    private BaseActor ocean;
    private Rock rock_1;
    private Rock rock_2;
    private Rock rock_3;
    private  Rock rock_4;
    private  Rock rock_5;
    public void initialize()
    {
        ocean = new BaseActor(0,0, mainStage);
        ocean.loadTexture( "assets/water.jpg" );
        ocean.setSize(800,600);
        BaseActor.setWorldBounds(ocean);
        starfish = new Starfish(700,500, mainStage);
        turtle = new Turtle(20,20, mainStage);
        rock_1 = new Rock(200,200, mainStage);
        rock_2 = new Rock(400,400,mainStage);
         rock_3 = new Rock(600,500,mainStage);
         rock_4 = new Rock(600,100,mainStage);
         rock_5 = new Rock(100,700, mainStage);
    }

    public void update(float dt)
    {
        if (turtle.overlaps(starfish) && !starfish.isCollected() )
        {

            starfish.collect();
            Whirpool whirl = new Whirpool(0,0, mainStage);
            whirl.centerAtActor( starfish );
            whirl.setOpacity(0.25f);
            BaseActor youWinMessage = new BaseActor(0,0,mainStage);
            youWinMessage.loadTexture("assets/you-win.png");
            youWinMessage.centerAtPosition(400,300);
            youWinMessage.setOpacity(0);
            youWinMessage.addAction( Actions.delay(1) );
            youWinMessage.addAction( Actions.after( Actions.fadeIn(1) ) );

            BaseActor.aa.setValues();
            BaseActor.aa.setVisible(true);
            System.out.println("__________"+ BaseActor.aa.getTimer());


        }
        turtle.preventOverlap(rock_1);
        turtle.preventOverlap(rock_2);
        turtle.preventOverlap(rock_3);
        turtle.preventOverlap(rock_4);
        turtle.preventOverlap(rock_5);
    }

}
