/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_05_2_exercise;

/**
 *
 * @author Mitch
 */

//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] array = new String[4];
        array[0] = "shirts";
        array[1] = "pants";
        array[2] = "socks";
        array[3] = "hats";
        
        // Change message to show the number of items purchased.
        message = custName + " wants to purchase " + array.length + " " + array[0];
        System.out.println(message);
        // Print an element from the items array.  

    }
}
