/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mitch
 */
public class Shirt extends Clothing {

    private char fit = 'u';

    public Shirt(int itemId, String desc, char colorCode, double price, char fit) {
        super(itemId, desc, colorCode, price);
        this.fit = fit;
    }

//    public Shirt(double price, char fit) {
//        super(price);
//        this.fit = fit;
//    }

    /**
     * @return the fit
     */
    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }
    @Override
    public void display(){
//        super.display();
        System.out.println("fit is: " + fit);
                
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
