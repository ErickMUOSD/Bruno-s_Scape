import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time   implements ActionListener{
    Timer Calculate;
     public int Contador_seg;

     public void Time() {

         Calculate = new Timer(1000,this);
    }
   public void OnStart(){
         Calculate.start();
   }
   public void OnStop(){
         Calculate.stop();
   }
   public void Check (boolean ut){

        if(ut) Calculate.start();
        else
            Calculate.stop();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Contador_seg++;
        System.out.println(Contador_seg);
    }
}
