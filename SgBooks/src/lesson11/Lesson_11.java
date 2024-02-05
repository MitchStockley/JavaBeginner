/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Mitch
 */
public class Lesson_11 {

    public static void main(String[] args) {
//        LocalDate myDate = LocalDate.now();
////        System.out.println(myDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date: " + jDate);
//        //formatting Dates
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Todays date time: " + today);
//        //formatting the date in standard ISO format
//        String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("date in iso format: " + sDate);

//        System.out.println("Args[0] is " + args[0]);
//        System.out.println("Args[1] is " + args[1]);
//2-dimentional arrays
//        int[][] yearlySales = new int[5][4];
//        yearlySales[0][0] = 1000;
//        yearlySales[0][1] = 1500;
//        yearlySales[0][2] = 1200;
//        yearlySales[1][0] = 1300;
//        yearlySales[3][3] = 1800;
//        
//        System.out.println(yearlySales[3][3]);
//while loops 
//        System.out.println("/*");
//        int counter = 0;
//        while(counter < 4) {
//            System.out.println(" *");
//            counter++;
//        }
//        System.out.println("*/");
//        int i = 0;
//
//        while (i < 3) {
//            System.out.println("less than 0 + " + i);
//            i++;
//        }
//        System.out.println("got there ");
//for loop
//for(int num = 0; num < 3; num++){
//    System.out.println("nearly there");
//}
//        System.out.println("there!");
//nested for loop
//        int height = 4, width = 10;
//
//        for (int row = 0; row < height; row++) {
//            for (int col = 0; col < width; col++) {
//                System.out.println("@");
//            }
//
//            System.out.println();
//        }
//        int sales[][] = new int[3][4];
//        sales = initArray(sales);
//
//        for (int y = 0; y < 3; y++) {
//            System.out.println("Year: " + (y + 1));
//            for (int q = 0; q < 4; q++) {
//                System.out.print("\t q: " + (q + 1) + " " + sales[y][y]);
//            }
//            System.out.println();

// Array Lists 
    
        ArrayList <String> names;
        names = new ArrayList();
        
        names.add("jamie");
        names.add("Gus");
        names.add("Alisa");
        names.add("Jose");
        names.add("prashaan");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.remove(names.size() -1);
        System.out.println(names);
        




        }

    }

//    static int[][] initArray(int[][] sales) {
//        for (int y = 0; y < 3; y++) {
//            for (int q = 0; q < 4; q++) {
//                sales[y][q] = (int) Math.floor(Math.random() * 2000);
//
//            }
//
//        }
//        return sales;
//
//    }
//}
