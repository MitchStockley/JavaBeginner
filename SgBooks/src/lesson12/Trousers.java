/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mitch
 */
public class Trousers extends Clothing{
    
    private char gender;
    private char fit;
    public Trousers( int itemId, String desc, char colorCode, double price, char gender){
        super(itemId, desc, colorCode, price);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
