package Book3.chapter7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockAnonymous {
    private String tickMessage = "tick";
    private String tockMessage = "tock";

    public static void main(String[] args) {

    }

    public void go()
    {
        Timer t = new Timer(1000, new ActionListener()
        {

            private boolean tick =  true;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tick)
                {
                    System.out.println(tickMessage);
                } else
                {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }

        });

        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to exit the program");;
        System.exit(0);

    }


}
