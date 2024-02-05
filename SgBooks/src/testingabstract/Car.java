/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingabstract;

/**
 *
 * @author Mitch
 */
public class Car extends Vehicle {
    
    int color;
    int price;
    String make;

    public Car(int color, int price, String make){
        this.color = color;
        this.price = price;
        this.make = make;
        
    }
    @Override
    public void Drive() {
        System.out.println("Minivan driving forward!");
    }

}
