package Book2.chapter3;

import java.text.NumberFormat;

public class NumberFormatClassApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {

        printMyAllowance();
        printCostOfPaintBallGub();

    }

    public static void printMyAllowance(){
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: " + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGub(){
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("cost of paintball gun: " + cf.format(costOfPaintBallGun));
    }

}
