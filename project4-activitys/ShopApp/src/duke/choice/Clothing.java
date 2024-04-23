/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Mitch
 */
public class Clothing implements Comparable <Clothing> {

    private String desc;
    private String size = "M";
    private double price;
    public final static double minPrice = 10;
    public final static double taxRate = 0.2;

    public Clothing(String desc, double price, String asize) {
        this.desc = desc;
        this.price = price;
        size = asize;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price * (1 + taxRate);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = (price > minPrice) ? price : minPrice;

    }

    @Override
    public String toString() {
        return getDesc() + "," + getSize() + "," + getPrice();
    }
    
    @Override
    public int compareTo(Clothing c){
        return this.desc.compareTo(c.desc);
    }

}
