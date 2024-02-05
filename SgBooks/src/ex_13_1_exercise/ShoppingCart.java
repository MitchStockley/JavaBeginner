package ex_13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList
        List<String> myDaysList = Arrays.asList(days);

        ArrayList<String> myDaysArrayList = new ArrayList(myDaysList);
        // Loop through the ArrayList, printing out "sunday" elements in 
        for (String day : myDaysArrayList) {
            if (day.equals("sunday")) {
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day);
            }

        }

        System.out.println(myDaysArrayList);

        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  
    }
}
