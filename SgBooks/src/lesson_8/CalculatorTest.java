/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author Mitch
 */
public class CalculatorTest {
    public static void main(String[] args) {
        int totalOne = Calculator.sum(2, 3);
        System.out.println("The total is: " + totalOne);
        
        float totalTwo = Calculator.sum(3.88F, 3F);
        System.out.println("The total is: " + totalTwo);
        
        float totalThree = Calculator.sum(2, 3.88F);
        System.out.println("The total is: " + totalThree);
    }
}
