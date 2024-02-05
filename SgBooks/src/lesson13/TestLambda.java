/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import java.util.*;

/**
 *
 * @author Mitch
 */
public class TestLambda {

    public static void main(String[] args) {
        String[] nums = {"one", "two", "Three"};
        List<String> myList = Arrays.asList(nums);
        System.out.println(myList);
        ArrayList<String> myArrayList = new ArrayList(myList);

        myList.replaceAll(s -> s.toUpperCase());
        System.out.println(myList);

        System.out.println(myArrayList);
        myArrayList.replaceAll(x -> x.toUpperCase());
        System.out.println(myArrayList);

        //long way
        myList.replaceAll((String s) -> {
            return s.toUpperCase();
        });
        
        myArrayList.removeIf(s -> s.equals("TWO"));
        System.out.println(myArrayList);
        
        
        

    }

}
