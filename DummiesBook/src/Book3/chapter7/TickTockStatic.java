package Book3.chapter7;

import Book3.chapter5.Ticker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockStatic {

    private static String tickMessage = "Tick...";
    private static String  tockmessage = "Tock";

    public static void main(String[] args) {
        TickTockStatic ts = new TickTockStatic();
        ts.go();

    }

    private void go(){
       Timer t = new Timer(1000, new Ticker());
       t.start();

       JOptionPane.showMessageDialog(null, "Click Ok to exit programme");
        System.exit(0);
    }

    static class Ticker implements ActionListener{
        private boolean tick = true;


        @Override
        public void actionPerformed(ActionEvent e) {
            if(tick)
            {
                System.out.println(tickMessage);
            } else
            {
                System.out.println(tockmessage);
            }
            tick = !tick;
        }
    }
}
