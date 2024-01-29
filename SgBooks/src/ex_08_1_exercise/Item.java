/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_08_1_exercise;

/**
 *
 * @author Mitch
 */

//Exercise 8-1

//In the Item class:
//1. Declare a setColor method that takes a char as an argument (a color code)
//     and returns a boolean.
//     Return false if the colorCode is ' '.
//     Otherwise, assign the colorCode to the color field and return true.
public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode) {
        if(colorCode == ' '){
            return false;
        } else {
            color = colorCode;
            return true;
        }
    }
}
