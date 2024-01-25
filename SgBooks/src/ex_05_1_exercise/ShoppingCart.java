/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_05_1_exercise;

/**
 *
 * @author Mitch
 */
//Exercise 5-1:
//
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.
public class ShoppingCart {

    public static void main(String[] args) {
        //exercise 5-1
        String custName = "Mitch";
        String itemDesc = "coke";

        double price = 22, tax = 0.15, total;
        int quantity = 10;

 String message = custName + " wants to purchase " + quantity + " " + itemDesc;
    
 total = price * quantity * tax;

        boolean outOfStock = true;

        if (quantity > 1) {
            message = message + "s";
        }

        if (outOfStock) {
            System.out.println("Sorry we are out of stock");
        } else {
            System.out.println(message);
            System.out.println("Total is " + total);
        }
    }
}
