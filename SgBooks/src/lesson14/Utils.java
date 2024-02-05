/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mitch
 */
public class Utils {

    public static void main(String[] args) {
        System.out.println("in msin method");
        try {
            doThis();
        } catch (Exception e) {
            System.out.println("back in main method - e");
        }

        System.out.println("back in main method");

    }

    static void doThis() throws Exception {
        System.out.println("Arrived in doThis()");
        doThat();
        System.out.println("back in doThis");

    }

    static void doThat() throws Exception {
        System.out.println("in doThat()");
        throw new Exception();

    }

}
