package Book3.chapter6;

public class CloneTest {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("martinez", "Anthony");
        emp1.setSalary(4000);
        Employee2 emp2 = (Employee2)emp1.clone();
        emp1.setLastname("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
