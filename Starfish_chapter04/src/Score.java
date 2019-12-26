import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {

    private JPanel Window1;
    private  JLabel Score;
    private  JLabel Velocidad;// v = d/T      v = 2000 ms2 / 3600 seg
    private JLabel  Trayectoria; // aumentar el contador variable++;
    private JLabel   Trabajo;/// masa * gravedad/(9.81) *distancia
    private JButton Btn_Home;
    private JButton Btn_Next;
     public int TimeBy;
     public float trayectory;

   public float velocidad_final ;
    public float trayectoria_final ;
    public float Masa = 180, Masa_Final;

    public  Score(){
     velocidad_final = 0;
     trayectoria_final = 0;
     Masa_Final = 0;

        this.setBounds(300,100,300,500);
       // this.setResizable(false);
        //this.setUndecorated(true);
        this.setLayout(null);


        Color Base = new Color(76,181,245);
        Font fuente = new Font("Chocolate Covered Raindrops",3,35);

        Window1 = new JPanel();
        Window1.setBounds(0,0,this.getWidth(),this.getHeight());
        Window1.setBackground(Base);
        Window1.setLayout(null);


        Score = new JLabel();
        Score.setBounds(60,50,250,50);
        Score.setFont(fuente);
        Score.setText("Score ");

        Velocidad = new JLabel();
        Velocidad.setBounds(0,130,250,50);
        Velocidad.setText(" VELOCIDAD 1000");
        Velocidad.setFont(fuente);


        Trayectoria = new JLabel();
        Trayectoria.setBounds(0,220,250,50);
        Trayectoria.setText(" Trayectoria 900m");
        Trayectoria.setFont(fuente);

        Trabajo = new JLabel();
        Trabajo.setBounds(0,300,2500,50);
        Trabajo.setText(" Trabajo 1212");
        Trabajo.setFont(fuente);

        Image icon1 = new ImageIcon("img/Home.png").getImage();
        ImageIcon cara1 = new ImageIcon(icon1.getScaledInstance(70, 60, Image.SCALE_SMOOTH));
        Btn_Home = new JButton(cara1);
        Btn_Home.setBounds(10,388,75,60);
        Btn_Home.setBackground(Base);
        Btn_Home.setBorderPainted(false);
        Btn_Home.setContentAreaFilled(false);
        Btn_Home.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        Btn_Home.setFocusPainted(false);

        Image icon2 = new ImageIcon("img/Next_Level.png").getImage();
        ImageIcon cara2 = new ImageIcon(icon2.getScaledInstance(70, 60, Image.SCALE_SMOOTH));
        Btn_Next = new JButton(cara2);
        Btn_Next.setBounds(200,400,75,50);
        Btn_Next.setBackground(Base);
        Btn_Next.setBorderPainted(false);
        Btn_Next.setContentAreaFilled(false);
        Btn_Next.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        Btn_Next.setFocusPainted(false);




        Window1.add(Score);
        Window1.add(Velocidad);
        Window1.add(Trayectoria);
        Window1.add(Trabajo);
        Window1.add(Btn_Home);
        Window1.add(Btn_Next);

        this.add(Window1);


     Btn_Home.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent actionEvent) {
             dispose();
             Inicio a = new Inicio();
             a.setVisible(true);
         }
     });
     Btn_Next.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent actionEvent) {
     JOptionPane.showMessageDialog(null, "En desarrollo");
         }
     });
    }

    public void setValues(){
        velocidad_final = (getTimer()/( getTrayectory()*5));
        trayectoria_final = getTrayectory();
        Masa_Final = (Masa * 9.81f ) * getTrayectory();

        Velocidad.setText("Velocidad es "+velocidad_final+"vm/s2");
        Trayectoria.setText("Trayectoria es: "+trayectory+"vm");
        Trabajo.setText("Trabajo e: "+Masa_Final+" J");
    }

    public int GetTimerBy(int Time){
       // System.out.println(" "+TimeBy);
        TimeBy = Time;
        return TimeBy;
    }

    public int getTimer() {
        return TimeBy;
    }
    public float getTrayectory(){
        return trayectory;
    }

    public float GetTrayectory(float Tra){
     //   System.out.println(" "+trayectory);
        return trayectory = Tra;
    }
   /*  public void updates(){

                velocidad_final = (int) (TimeBy/ trayectory);
                trayectoria_final = trayectory;
                Masa_Final = (Masa * 9.81f * trayectory);

                Velocidad.setText("Velocidad es "+velocidad_final);
                Trayectoria.setText("Trayectoria es: "+trayectory);
                Trabajo.setText("Trabajo e: "+Masa_Final);


    }*/

}
