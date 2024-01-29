/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_9;

/**
 *
 * @author Mitch
 */
public class ShirtTest {

    public static void main(String[] args) {
        Shirt theShirt = new Shirt('R',"shirt", 55);

//        theShirt.setColorCode('G');
        System.out.println("color code is " + theShirt.getColorCode());
        
        Shirt myShirt = new Shirt();
        System.out.println("color of myShirt is " + myShirt.getColorCode());
        
        Shirt newShirt = new Shirt('b', 100);
        System.out.println("color is " + newShirt.getColorCode());
//        theShirt.setColorCode('Z');
//        System.out.println("The shirt color code is " + theShirt.getColorCode());

    }
}
