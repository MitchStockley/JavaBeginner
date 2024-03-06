package Book2.chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameMethod {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Lets play a guessing game...");

        do {

            playAround();
        }
        while (askForAnotherRound());
        System.out.println("Thank you for playing!");


    }


    //get random number method
    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }


    //play around method

    public static void playAround() {
        boolean validInput;
        int number, guess;
        String message;
        number = getRandomNumber();

        System.out.println("\nIm thinking of a random number between 1 - 10");
        System.out.print("What do you think the number is?: ");

        guess = getGuess();

        if (guess == number) {
            System.out.println("Good guess, that is correct");
        } else {
            System.out.println("You are wrong: " + number);
        }
    }


    //get guess method
    public static int getGuess() {
        int guess = 0;

        while (true) {
            try {
                guess = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Not a valid integer");
            } catch (Exception ex) {
                System.out.println("This error occured: " + ex.getMessage());
                System.exit(0);
            }


            if ((guess > 0) && (guess <= 10)) {
                return guess;
            } else {
                System.out.println("Please try again");
            }


        }
    }

    //ask for another round method

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.println("\nPlay again? : (Y or N)");
            answer = sc.next();

            if (answer.equalsIgnoreCase("y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }


}
