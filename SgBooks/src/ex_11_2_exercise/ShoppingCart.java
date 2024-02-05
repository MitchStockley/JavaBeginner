/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_11_2_exercise;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;
        
        if(args.length < 2){
            System.out.println("2 args required");
        }
        
        name = args[0];
        age = Integer.parseInt(args[1]);
        System.out.println("name is " + name + " age is " + age);
    }
      
}
