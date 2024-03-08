package Book3.chapter6;

public class TestEquality {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Martinez", "Anthony");

        if(emp1.equals(emp2)) System.out.println("These employees are the same");
        else System.out.println("These are different people");

    }
}
