import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame {
    JButton a;
    public Animation(){
    this.setBounds(300,100,900,700);
    this.setLayout(null);
    a = new JButton();
    a.setText("EN DESARROLLO/ SIGUIENTE");
    a.setBounds(200,100,400,300);
    this.add(a);
    a.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dispose();
            Game myGame = new StarfishCollector();
            LwjglApplication launcher =
                    new LwjglApplication( myGame, "Starfish Collector", 800, 600 );
        }
    });
    }

}
