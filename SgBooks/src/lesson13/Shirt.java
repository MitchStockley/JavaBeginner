/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author Mitch
 */
public class Shirt extends Clothing implements Printable,Returnable {

    private char fit = 'U';

    public Shirt(int itemId, String desc, double price, char colorCode, char fit) {
        super(itemId, desc, price, colorCode);
        this.fit = fit;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    @Override
    public double getPrice() {
        return 200.99;
    }

    @Override
    public void display() {
        //  super.display();
        System.out.println("Fit is " + fit);

    }

    @Override
    public String toString() {
        return "\nItem id is: " + getItemId() + " \nDescription is: " + getDesc() + "\nPrice is: " + getPrice() + " \nColorcode is: " + getColorCode();
    }

    @Override
    public void print() {
        System.out.println("Printing");
    }
    
    @Override
    public void doReturn(){
        System.out.println("Returning items");
    }
}
