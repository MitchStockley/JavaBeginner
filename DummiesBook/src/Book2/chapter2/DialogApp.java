package Book2.chapter2;

import javax.swing.*;

public class DialogApp {
    public static void main(String[] args) {
        String s;

        s = JOptionPane.showInputDialog("enter an int");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
