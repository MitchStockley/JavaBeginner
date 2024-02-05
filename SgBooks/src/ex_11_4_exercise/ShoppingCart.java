/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_11_4_exercise;

import java.util.ArrayList;

/**
 *
 * @author Mitch
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.

        ArrayList<String> names;
        names = new ArrayList();
        names.add("Mike");
        names.add("Jake");
        names.add("jade");
        System.out.println(names);

        // add (insert) another element at a specific index
        names.add(1, "Sarah");
        System.out.println(names);
        // Check for the existence of a specific String element. 
        if (names.contains("jade")) {
            names.remove("jade");
        }

        System.out.println(names);

        //   If it exists, remove it.
    }
}
