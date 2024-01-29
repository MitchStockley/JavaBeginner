/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_08_2_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {
     public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
       item1.setItemDisplay("clothes", 5, 50);
       item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
       
       int check = item1.setItemDisplay("shirt", 45, 50, 'G');
       if(check < 0){
           System.out.println("invalid message");
       } else item1.displayItem();

	// Test your code for both valid and invalid values
 
        
        
    }
    
}
