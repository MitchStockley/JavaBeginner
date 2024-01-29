/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_9;

/**
 *
 * @author Mitch
 */
public class Order {

    public static void main(String[] args) {
        Customer cust = new Customer(); //creating new customer
        Item item1 = new Item(); //creating new item
        Item item2 = new Item(); //creating new item
        Item item3 = new Item(); //creating new item
//        item.price = 10.00;

        cust.hasLoyaltyDiscount = true; //changing cust discount to true
        item1.setPrice(cust);
        item2.setPrice(cust);
        item3.setPrice(cust);

    }
}

class Item {

    static private int nextId = 0;
    private double price = 15.50;

    public Item() {
        setId();
    }

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount) {
            price = price * .85;

        }
        System.out.println("price of item is: " + price);
    }

    private void setId() {
        nextId = nextId + 1;
        System.out.println("id is: " + nextId);

    }

}

class Customer {

    public boolean hasLoyaltyDiscount; //default is false 
}
