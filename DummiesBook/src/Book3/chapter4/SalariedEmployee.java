package Book3.chapter4;

import java.text.NumberFormat;

public class SalariedEmployee extends Employee{
    double salary;

    public SalariedEmployee(double salary){
        this.salary = salary;
    }

    public String getFormattedSalary(){
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        return cf.format(this.salary);
    }
}
