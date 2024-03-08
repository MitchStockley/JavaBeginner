package Book3.chapter6;

public class CloneTest2 {
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3("Martinez", "Anthony");
        emp1.setSalary(40000.0);

        emp1.address = new Address("1 First Street", "Fresno", "CA", "93702");
        Employee3 emp2 = (Employee3) emp1.clone();

        System.out.println("**** after cloning ****\n");

        printEmployee(emp1);
        printEmployee(emp2);

        emp2.setLastName("Smith");
        emp2.address = new Address("2 Second Street","Fresno", "CA", "93722");

        System.out.println("**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);

        System.out.println(emp1.getClass().getName());
        System.out.println(emp2.getClass().getName());
    }

    private static void printEmployee(Employee3 e) {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}
