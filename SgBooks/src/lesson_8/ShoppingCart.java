/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {

    public static void main(String[] args) {

//        Shirt shirt01 = new Shirt("Hoodie", "Blue", 55);
//
//        Shirt shirt02 = new Shirt("Pants", "green", 55);
//
//        Shirt shirt03 = new Shirt("Sweater", "Orange", 55);
//
//        Shirt shirt04 = new Shirt("Vest", "red", 55);

        Shirt myShirt =  new Shirt("sailer", "green", 300);
        System.out.println(myShirt.colorCode);
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt color after: " + myShirt.colorCode);

            
    }
    public static void changeShirtColor(Shirt theShirt, char color){
                theShirt = new Shirt("sailor2","Yellow", 199);
                theShirt.colorCode = color;
            }

}
