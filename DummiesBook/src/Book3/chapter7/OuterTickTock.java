package Book3.chapter7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OuterTickTock {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        OuterTickTock t = new OuterTickTock();
        t.go();
    }

    private void go(){
       Timer t = new Timer(1000, new InnerTicker());
       t.start();

       JOptionPane.showMessageDialog(null, "Click ok to exit");
       System.exit(0);

    }

    class InnerTicker implements ActionListener{

        private boolean tick = true;
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
    }
}
