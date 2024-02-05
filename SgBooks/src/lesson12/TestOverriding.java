/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mitch
 */
public class TestOverriding {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt(1, "shirt",'R', 200, 'M');
        myShirt.display();
        
        System.out.println();
        
        Trousers myTrousers = new Trousers(2,"Jeans", 'R', 300, 'M');
        myTrousers.display();
    }
}
