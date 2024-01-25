/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_5;

/**
 *
 * @author Mitch
 */
public class Lesson5 {

    public static void main(String[] args) {
//        int attendees = 10;
//        boolean largeVenue;
//
//        if (attendees >= 5) {
//            largeVenue = true;
//        } else {
//            largeVenue = false;
//        }
//        System.out.println(largeVenue);

        //declaring and initialising an arry
//        int[] ages = new int[3];
//        ages[0] = 19;
//        ages[1] = 42;
//        ages[2] = 92;
        
//        String[] names = new String[3];
//        names[0] = "Mary";
//        names[1] = "Bob";
//        names[2] = "Carlos";

//int[] ages = {19,42,92};
//String[] names = {"mary", "Bob", "Carlos"};
//
//int myAge = ages[0];
//int yourAge = ages[1];
//        System.out.println("My age is " + ages[0]);
//        System.out.println("My name is " + names[0]);
 
        //Loops 
        //looping through each element in the names array and
        //printing it to the console
        
//        String [] names = {"george", "Joel", "Xinyi", "Ravi"};
//        for (String n: names){
//            System.out.println("name is " + n);
//        }

        int passmark = 12;
        boolean passed = false;
        int[] scores = {4,6,2,8,12,35,9};
        
        for (int unitScore : scores) {
            if(unitScore >= 12) {
                passed = true;
                break;
            }
        }
        
        System.out.println("At least one passed? " + passed);
    }
}
