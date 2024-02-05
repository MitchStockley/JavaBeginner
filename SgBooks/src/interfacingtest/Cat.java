/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacingtest;

/**
 *
 * @author Mitch
 */
public class Cat implements Prey, Predator {

    

    @Override
    public void Hunt() {
        System.out.println("Is doing the hunting");
    }

    @Override
    public void Run() {
        System.out.println("Running for its life");
    }
}
