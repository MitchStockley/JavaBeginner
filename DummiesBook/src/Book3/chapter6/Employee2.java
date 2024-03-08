package Book3.chapter6;

public class Employee2 {
    private String lastname;
    private String firstname;
    private Double salary;

    public Employee2(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;


    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Object clone(){
        Employee2 emp;
        emp = new Employee2(this.lastname,this.firstname);
        emp.setSalary(this.salary);
        return emp;

    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + this.firstname + " " + this.lastname + ", " + this.salary + "]";
    }
}
