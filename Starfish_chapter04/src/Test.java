import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Timer;

public class Test  implements  ActionListener{
    public static int Contador_seg;
    Timer timer;

    public  Test(){
        Scanner a = new Scanner(System.in);
       Contador_seg = 0;
        int A;
        boolean Condicion = true;
/*
       timer = new Timer(1000,this);
        do {
            System.out.println("Numero  ");
            A = a.nextInt();

            switch (A) {

                case 1:
                    System.out.println("Run");
                    timer.start();

                    break;
                case 2:
                    System.out.println("pause");
                    timer.stop();
                    break;
                case 3:
                    Condicion =false;
                    break;
            }

        }while(Condicion == true);
        System.out.println("segundos han sido: "+Contador_seg);
*/


    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
