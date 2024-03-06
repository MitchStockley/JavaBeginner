package Book2.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInterger {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an int: ");
        int i = getInteger();
        System.out.println("You entered: " + i);

    }

    public static int getInteger(){
        while (true)
        {
            try{
                return sc.nextInt();
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Thats not an int ");
            }
        }
    }
}
