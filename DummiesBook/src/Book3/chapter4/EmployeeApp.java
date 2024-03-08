package Book3.chapter4;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter S if you receive a monthly salary. Enter H if you receive an hourly wage");
        String EmployeeType = sc.nextLine();
        System.out.println("Please enter the amount you receive");
        double EmployeeAmount = sc.nextDouble();

        Employee emp;

        if(EmployeeType.equalsIgnoreCase("S"))
        {
            emp = new SalariedEmployee(EmployeeAmount);
            System.out.println(((SalariedEmployee)emp).getFormattedSalary());
        } else if (EmployeeType.equalsIgnoreCase("H"))
        {
            emp = new HourlyEmployee(EmployeeAmount);
            System.out.println(((HourlyEmployee)emp).getFormattedrate());
        } else
        {
            System.out.println("Invalid employee type, try again!");
            System.exit(0);
        }
    }
}
