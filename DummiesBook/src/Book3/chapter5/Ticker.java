package Book3.chapter5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ticker implements ActionListener {

    private boolean tick = true;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tick){
            System.out.println("Tick...");
        } else
        {
            System.out.println("Tock...");
        }
        tick = !tick;
    }
}
