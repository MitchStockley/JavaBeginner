/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_10_1_exercise;

/**
 *
 * @author Mitch
 */
public class TestClass {

    public static void main(String args[]) {
        int x = 4, y = 9;
//        if (y / x < 3) {
//            x += y;
//        } else {
//            x *= y;
//        }
//        System.out.println("After if stmt, x = " + x);

        // Use a ternary operator to perform the same logic as above.
        System.out.println("after if stmt, x = " + (((y / x) < 3) ? (x += y) : (x *= y)));
    }
}
