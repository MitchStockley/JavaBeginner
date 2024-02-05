/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_11_1_exercise;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Mitch
 */
public class ShoppingCart {
     public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
 LocalDateTime orderDate;
        
	// Initialize the LocalDateTime object and print it.
        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);

	// Format the object using ISO_LOCAL_DATE; Print it.
        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);

    }
}
