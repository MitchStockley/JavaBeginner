package Book2.chapter5;

import java.util.Scanner;

public class GetABet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;
        double bet;

        System.out.println("you can bet between 1 and : " + bank);

        do {
            System.out.println("enter your bet: ");
            bet = sc.nextDouble();

            if ((bet <= 0) || (bet >= bank)) {
                System.out.println("Invalid bet");
            }
        } while ((bet <= 0) || (bet > bank));
        System.out.println("thank you for betting");


    }
}
