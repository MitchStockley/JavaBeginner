/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_10;

/**
 *
 * @author Mitch
 */
public class Employees {

    public String name1 = "Fred Smith";
    public String name2 = "fred smith";

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) { //can add IgnoreCase to check without capital letters 
            System.out.println("same names");
        } else {
            System.out.println("not the same");
        }
    }
    
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.areNamesEqual();
    }
    
}
