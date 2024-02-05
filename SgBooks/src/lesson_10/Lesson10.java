/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_10;

/**
 *
 * @author Mitch
 */
public class Lesson10 {

    public static void main(String[] args) {
//        int i = 2;
//        int j = 8;
//        
//        System.out.println((i < 1) && (j > 6));
//        
//        System.out.println((i < 1) || (j > 6));
//        
//        System.out.println(!(i < 3));

//ternary operators
//           int x = 2, y = 5, z = 0;
//           
//           z = (y < x) ? x : y;
//           System.out.println("z is : " + z);
//           
//           int numberOfGoals = 10;
//           System.out.println("i scored "+ numberOfGoals + " " + ((numberOfGoals == 1) ? "goal" : "goals")); 
        int month = 5;
        boolean isLeapYear = true;
//        if (month == 1 || month == 3 || month == 5 || month == 7
//                || month == 8 || month == 10 || month == 12) {
//            System.out.println("31 days in a month");
//
//        } else if (month == 2) {
//            if (!isLeapYear) {
//                System.out.println("28 days in a month");
//            } else {
//                System.out.println("29 days in a month");
//            }
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("30 days in a month");
//        } else {
//            System.out.println("invalid month ");
//        }

        //switch statements 
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in a month");
                break;

            case 2:
                if (!isLeapYear) {
                    System.out.println("28 days in a month");

                } else {
                    System.out.println("29 days in a month");
                }
                break;

            case 6:
            case 9:
            case 11:
                System.out.println("30 days in a month");
                break;
            default:
                System.out.println("invalid month");

        }
    }
}
