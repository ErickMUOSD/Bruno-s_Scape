import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Inicio extends JFrame {
    JButton Btn_Play;
    JButton Btn_Config;
    JButton Btn_last_Checkpoint;
    JButton Nombre_Play;
    JButton Nombre_Config;
    JButton Nombre_Checkpoi;
    public Inicio() {
        this.setUndecorated(false);
        this.setBounds(300, 100, 900, 700);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(2);
        setTitle("Game-Fisica");

        Color Head = new Color(162, 197, 35);
        Color Body = new Color(134, 226, 28);
        Color p1 = new Color(125, 68, 39);
        Color p2 = new Color(92, 201, 255);
        Color p3 = new Color(230,74,25);

        JPanel P1 = new JPanel();
        P1.setBounds(0, 0, this.getWidth(), 100);
        P1.setBackground(p3);

        JPanel P2 = new JPanel();
        P2.setBounds(0, 100, this.getWidth(), 600);
        P2.setBackground(p2);
        P2.setLayout(null);

        Image icon1 = new ImageIcon("img/Play_green.png").getImage();
        ImageIcon cara1 = new ImageIcon(icon1.getScaledInstance(190, 200, Image.SCALE_SMOOTH));
        Btn_Play = new JButton( cara1);
        Btn_Play.setBounds(50, 150, 200, 200);
        Btn_Play.setBackground(p2);
        Btn_Play.setBorderPainted(false);
        Btn_Play.setContentAreaFilled(false);
        Btn_Play.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));


        Btn_Config = new JButton();
        Btn_Config.setBounds(340, 150, 200, 200);
        Image icon2 = new ImageIcon("img/Settings_green.png").getImage();
        ImageIcon cara2 = new ImageIcon(icon2.getScaledInstance(190, 200, Image.SCALE_SMOOTH));
        Btn_Config.setIcon(cara2);
        Btn_Config.setBackground(p2);
        Btn_Config.setBorderPainted(false);
        Btn_Config.setContentAreaFilled(false);
        Btn_Config.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        Btn_last_Checkpoint = new JButton();
        Btn_last_Checkpoint.setBounds(600, 150, 200, 200);
        Image icon3 = new ImageIcon("img/Last_checkpoint.png").getImage();
        ImageIcon cara3 = new ImageIcon(icon3.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        Btn_last_Checkpoint.setIcon(cara3);
        Btn_last_Checkpoint.setBackground(p2);
        Btn_last_Checkpoint.setBorderPainted(false);
        Btn_last_Checkpoint.setContentAreaFilled(false);
        Btn_last_Checkpoint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Image Name_Icon = new ImageIcon("img/Play.png").getImage();
        ImageIcon Play_nombre = new ImageIcon(Name_Icon.getScaledInstance(120, 70, Image.SCALE_SMOOTH));
        Nombre_Play = new JButton();

        Nombre_Play.setIcon(Play_nombre);
        Nombre_Play.setBounds(100,375,120,70);
        Nombre_Play.setBorderPainted(false);
        Nombre_Play.setBackground(p2);
        Nombre_Play.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Nombre_Play.setContentAreaFilled(false);

        Image Name_Icon2 = new ImageIcon("img/Settings.png").getImage();
        ImageIcon Play_config = new ImageIcon(Name_Icon2.getScaledInstance(120, 70, Image.SCALE_SMOOTH));

        Nombre_Config = new JButton();
        Nombre_Config.setIcon(Play_config);
        Nombre_Config.setBounds(380,375,120,70);
        Nombre_Config.setBorderPainted(false);
        Nombre_Config.setBackground(p2);
        Nombre_Config.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Nombre_Config.setContentAreaFilled(false);

        Image Name_Icon3 = new ImageIcon("img/Checkpoint.png").getImage();
        ImageIcon Play_Check = new ImageIcon(Name_Icon3.getScaledInstance(170, 70, Image.SCALE_SMOOTH));
        Nombre_Checkpoi = new JButton();
        Nombre_Checkpoi.setIcon(Play_Check);
        Nombre_Checkpoi.setBackground(p2);
        Nombre_Checkpoi.setBounds(630,375,170,70);
        Nombre_Checkpoi.setBorderPainted(false);
        Nombre_Checkpoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Nombre_Checkpoi.setContentAreaFilled(false);


       // Draw_names Cargar = new  Draw_names();
        //Cargar.Cargar_imagen(P2.getGraphics());


        P2.add(Btn_Play);
        P2.add(Btn_Config);
        P2.add(Btn_last_Checkpoint);
        P2.add(Nombre_Play);
        P2.add(Nombre_Config);
        P2.add(Nombre_Checkpoi);

        this.add(P1);
        this.add(P2);

        Btn_Play.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                   dispose();
                Game MyGame = new StarfishCollectorBeta();
                LwjglApplication launcher =
                        new LwjglApplication( MyGame, "Starfish Collector", 800, 600 );

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                Image icon1 = new ImageIcon("img/Play_green_bigger.png").getImage();
                ImageIcon cara4 = new ImageIcon(icon1.getScaledInstance(220, 220, Image.SCALE_SMOOTH));
                Btn_Play.setBounds(50, 150, 220, 220);
                Btn_Play.setIcon(cara4);
                Btn_Play.setBorderPainted(false);

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            Btn_Play.setIcon(cara1);
            }
        });
        Btn_Config.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                Image icon5= new ImageIcon("img/Settings_green_bigger.png").getImage();
                ImageIcon cara5 = new ImageIcon(icon5.getScaledInstance(220, 220, Image.SCALE_SMOOTH));
                Btn_Config.setSize(220,220);
                Btn_Config.setIcon(cara5);
                Btn_Config.setBorderPainted(false);

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
              Btn_Config.setIcon(cara2);
            }
        });
        Btn_last_Checkpoint.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                Image icon6= new ImageIcon("img/Last_checkpoint.png").getImage();
                ImageIcon cara6 = new ImageIcon(icon6.getScaledInstance(220, 220, Image.SCALE_SMOOTH));
                Btn_last_Checkpoint.setSize(220,220);
                Btn_last_Checkpoint.setIcon(cara6);
                Btn_last_Checkpoint.setBorderPainted(false);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
             Btn_last_Checkpoint.setIcon(cara3);
            }
        });
    }


    public static void main(String[] args) {
        Inicio a = new Inicio();
        a.setVisible(true);
    }
}
