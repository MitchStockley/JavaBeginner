/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingabstract;

/**
 *
 * @author Mitch
 */
public class Main {
    public static void main(String[] args) {
      
         //Car object
    Car miniVan = new Car(300,33,"BMW");
        System.out.println(miniVan.color);
        System.out.println(miniVan.make);
    
    
    miniVan.Drive();
    
    miniVan.returnCar();
    }
    
    
    
}
