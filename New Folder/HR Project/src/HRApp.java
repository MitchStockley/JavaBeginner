
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mitch
 */
public class HRApp {
    
    

    public static void main(String[] args) {
        System.out.println("App is starting");
        System.out.println();

        Department d1 = new Department("HeadOffice", "Sales");
        Department d2 = new Department("Marketing", "Sales");
        Department d3 = new Department("Finance", "Accounts");
        Department d4 = new Department("Human Resources", "HR");
        Department d5 = new Department("Research and Development", "R&D");
        Department d6 = new Department("Customer Service", "Support");

        Employee e1 = new Employee(566, "John Doe", 50000);
        Employee e2 = new Employee(789, "Alice Smith", 60000);
        Employee e3 = new Employee(123, "Bob Johnson", 55000);
        Employee e4 = new Employee(456, "Emily Davis", 52000);
        Employee e5 = new Employee(999, "Michael Wilson", 48000);
        Employee e6 = new Employee(888, "Samantha Brown", 62000);

        d1.addEmployee(e1);
        d2.addEmployee(e2);
        d4.addEmployee(e3);
        d4.addEmployee(e4);
        d4.addEmployee(e5);
        d4.addEmployee(e6);
        

        
//        System.out.println(d4.findEmployeeById(888));
        
        System.out.println("Department: " + d4.getDepartment());
        
        d4.getAllEmployeesByDepartment();
        System.out.println("Total salary: " + d4.calculateTotalSalaries());
        System.out.println("Average Salary: " + d4.calculateAverageSalaries());
        
        
       
      
       

    }
    


}
