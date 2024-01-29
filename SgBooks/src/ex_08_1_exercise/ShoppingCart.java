/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_08_1_exercise;

/**
 *
 * @author Mitch
 */
//In the ShoppingCart class:
//2. Call the setColor method on item1.  If it returns true,
//     print out item1.color.  If it returns false, print an
//     invalid color message.
//3. Test the method with both a valid color and an invalid one.
public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        if (item1.setColor('G')) {

            System.out.println(item1.color);
        } else {
            System.out.println("Invalid color");
        }

    }
}
