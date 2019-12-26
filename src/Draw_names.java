import javax.swing.*;
import java.awt.*;

public class Draw_names {



        ImageIcon Play = new ImageIcon(new ImageIcon(getClass().getResource("img/Play.png")).getImage());


    public void Cargar_imagen(Graphics g) {

        g.drawImage(Play.getImage(), 50, 50, 150, 100, null);
    }
}
