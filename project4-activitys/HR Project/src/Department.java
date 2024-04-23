/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mitch
 */
public class Department {

    private String name;
    private String department;
    private Employee[] employees = new Employee[10];
    private int employeeCount = 0;

    public Department(String name, String department) {
        this.name = name;
        this.department = department;
//        this.employees = employees;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the employees
     */
    public Employee[] getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    //add employee to the department
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Array is full");
        }
    }

    public Employee[] getAllEmployees() {

        Employee[] nonNullEmployees = new Employee[employeeCount];
        int nonNullIndex = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                nonNullEmployees[nonNullIndex] = employee;
                nonNullIndex++;
            }
        }

        return nonNullEmployees;

    }

    public int getEmployeeCount() {

        return employeeCount;
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getIdNum() == id) {
                return employee;
            }

        }

        return null;
    }

    //calculate total salaries
    public double calculateTotalSalaries() {
        double totalSalaries = 0;

        for (Employee employee : employees) {
           if (employee != null) {
            totalSalaries += employee.getSalary();
        }
        }

        return totalSalaries;

    }

    public double calculateAverageSalaries() {
        double count = 0;
        double totalSalaries = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                totalSalaries += employee.getSalary();
            }

        }
        return (count > 0) ? totalSalaries / count : 0;

    }

    @Override
    public String toString() {
        return "department: " + name + ", Role: " + department;
    }

    public void getAllEmployeesByDepartment() {
        System.out.println("Employees in department " + name + ":");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println(); // Add a newline for clarity
    }

}
