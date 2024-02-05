/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mitch
 */
public class TestOfPolymorphism {
    public static void main(String[] args) {
        Clothing c1 = new Shirt(1, "shirt",'R', 200, 'M');
        Clothing c2 = new Trousers(2,"Jeans", 'R', 300, 'M');
        Clothing c3 = new Socks(3, "Nike", 'B', 150);
        
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c3.display();
        
        System.out.println(((Shirt)c1).getFit());
        
        if(c2 instanceof Trousers){
        ((Trousers)c2 ).getFit();
    }
    }
}
