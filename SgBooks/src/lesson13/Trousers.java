/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author Mitch
 */

public class Trousers extends Clothing implements Printable,Returnable{
    
    private char gender;
    private char fit;
    public Trousers( int itemId, String desc,double price, char colorCode,  char gender){
        super(itemId, desc, price,colorCode );
        this.gender = gender;
    }
//
//    /**
//     * @return the gender
//     */
    public char getGender() {
        return gender;
    }

//    /**
//     * @param gender the gender to set
//     */
    public void setGender(char gender) {
        this.gender = gender;
    }
   
    @Override 
    public void display(){
//        super.display();
        System.out.println("Gender is " + getGender());
    }

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
    public double getPrice() {
       return 0;
    }
    @Override
     public void print() {
        System.out.println("Printing");
    }
    @Override
    public void doReturn(){
        System.out.println("Returning testing trousers");
    }
}
