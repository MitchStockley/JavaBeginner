/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author Mitch
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to duke choice shop");

        Customer c1 = new Customer("Pinky", 14);

        System.out.println("Min price : " + Clothing.minPrice);
        Clothing item1 = new Clothing("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange tShirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue tShirt", 9.5, "S");

        Clothing[] items = {item1, item2, item3, item4};

        c1.addItems(items);

        System.out.println("Customer name: " + c1.getName() + c1.getSize() + ", " + "Total cost: " + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
//            

            System.out.println("Item: " + item);

        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = average / count;
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        Arrays.sort(c1.getItems());
         for (Clothing item : c1.getItems()) {
//            System.out.println("Items: " + item.getDesc());

            System.out.println("Item: " + item);

        }

    }

}
