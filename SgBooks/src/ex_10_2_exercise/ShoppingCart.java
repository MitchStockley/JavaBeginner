/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_10_2_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {

    public static void main(String args[]) {
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: " + order.getDiscount());
        
        Order order2 = new Order("Rick Wilson", 610.00, "VA", Order.CORP);
        System.out.println("Discount is: " + order2.getDiscount());
    }
}
