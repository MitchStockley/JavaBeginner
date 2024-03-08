package Book3.chapter6;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if(this.getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName());


    }


}
