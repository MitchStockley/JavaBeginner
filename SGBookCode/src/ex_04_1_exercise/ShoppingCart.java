/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_04_1_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {
//1.  Declare and initialize 2 String variables: custName and itemDesc
//2.  Declare a String variable called message.  Do not initialize it.
//3.  Assign the message variable with a concatenation of the custName and itemDesc.  
//   Include a String literal that results in a complete sentence.  
//   (example: "Mary Smith wants to purchase a Shirt")
//4.  Print the message to the System output.
//5.  Run the code.

    public static void main(String[] args) {
//        exercise 4-1
        String custName = "Mitch", itemDesc = "coke";
        String message;
        message = "customer " + custName + " wants to order " + itemDesc;
        System.out.println(message);

    }
}
