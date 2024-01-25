/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_6;

/**
 *
 * @author Mitch
 */
public class Shirt {

    public int shirtID;
    public double price;
    public char colorCode;

    public static void main(String[] args) {

        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt.shirtID = 12;
        myShirt.price = 15.99;
        myShirt.colorCode = 'B';

        yourShirt.shirtID = 12;
        yourShirt.price = 15.99;
        yourShirt.colorCode = 'B';

        myShirt = yourShirt;

        myShirt.colorCode = 'R';
        yourShirt.colorCode = 'G';

        System.out.println(myShirt.colorCode);
    }
}
