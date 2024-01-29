/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author Mitch
 */
public class Shirt {

    public String description;
    public char colorCode;
    public double price;

    public Shirt(String desc, String color, double price) {
        setFields(desc, price);
        setColor(color);
        display();
    }

    public void setColor(String color) {
        if (color.length() > 0) {
            colorCode = color.charAt(0);
        }
    }

    public void display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Shirt price: " + price);
    }

    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price;
    }
}
