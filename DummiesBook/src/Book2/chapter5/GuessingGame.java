package Book2.chapter5;

import java.util.Scanner;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean keepPlaying = true;
        System.out.println("Lets play a guessing game");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            number = (int) (Math.random() * 10) + 1;
            System.out.println("\nIm thinking of a number " + " between 1 - 10");
            System.out.print("what do you think it is?");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("I said between 1 and 10 " + "Try again");
                    validInput = false;
                }
            } while (!validInput);
            if (guess == number)
                System.out.println("You are right");
            else
                System.out.println("You are wrong" + "The number was " + number);
            //play again
            do {
                {
                    System.out.print("\n Play again?(y or n)");
                    answer = sc.next();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")) ;
                    else if (answer.equalsIgnoreCase("N"))
                        keepPlaying = false;
                    else
                        validInput = false;

                }


            } while (!validInput);
            System.out.println("\n Thank you for playing");

        }
    }
}

