/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_06_2_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item myItem = new Item();
        Item yourItem = new Item(); 
        
        myItem.desc = "pants";
        yourItem.desc = "Shirts";
        
        
	// Print both item descriptions and run code.
        System.out.println("myItem is: " + myItem.desc);
        System.out.println("yourItem is: " + yourItem.desc);

	// Assign one item to another and run it again.
        System.out.println("Assign one item to another and run it again");
        myItem = yourItem;
        System.out.println("myItem is: " + myItem.desc);
        System.out.println("yourItem is: " + yourItem.desc);
        
     }
}
