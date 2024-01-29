/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_08_2_exercise;

/**
 *
 * @author Mitch
 */
public class Item {

    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", " + colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemDisplay(String desc, int quantity, double price) {
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }
    // Write a public 4-arg setItemDisplay method that returns an int.

    public int setItemDisplay(String desc, int quantity, double price, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemDisplay(desc, quantity, price);
            return 1;
        } else {
            return -1;
        }
    }
}