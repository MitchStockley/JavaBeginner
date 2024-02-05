/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author Mitch
 */


public abstract class Clothing {

    private int itemId;
    private String desc;
    private double price;
    private char colorCode;


    public  Clothing(int itemId, String desc, double price, char colorCode) {
        this.itemId = itemId;
        this.desc = desc;
        this.price = price;
        this.colorCode = colorCode;
    }

    public abstract double getPrice() ;

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    public abstract void display();
}