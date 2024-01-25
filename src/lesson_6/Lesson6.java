/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_6;

/**
 *
 * @author Mitch
 */
public class Lesson6 {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();
        
        customer01.age = 40;
        customer02.name = "Duke";
        
        customer01.displayCustomer();
        customer02.displayCustomer();
    }
}
