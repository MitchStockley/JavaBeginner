/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_04_2_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {

    public static void main(String[] args) {
        //exercise 4-1
        String custName = "Mitch";
        String itemDesc = "coke";

//        System.out.println(message);
        //exercise 4-2
        double price = 22, tax = 0.15, total;

        int quantity = 10;

        String message = custName + " wants to purchase " + quantity + " " + itemDesc + "s";
        System.out.println(message);

        total = price * quantity * tax;
        System.out.println("total cost with tax is R" + total);
    }

}
