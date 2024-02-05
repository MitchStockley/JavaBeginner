/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingabstract;

/**
 *
 * @author Mitch
 */
public abstract class Vehicle {

    //not abstract because this isnt a garenteed action
    public void returnCar() {
        System.out.println("Returned by un happy customer");
    }

    //abstract because every type of car has to drive
    abstract void Drive();

}
