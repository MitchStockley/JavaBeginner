/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_12_2_exercise;

/**
 *
 * @author Mitch
 */
public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    @Override 
    public void display(){
        super.display();
        System.out.println("\tsize is : " + size);
        System.out.println("\tcolorCode field is: " + colorCode);
    }

}
