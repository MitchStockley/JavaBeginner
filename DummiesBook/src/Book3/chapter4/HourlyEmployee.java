package Book3.chapter4;

import java.text.NumberFormat;

public class HourlyEmployee extends Employee{
    double rate;

    public HourlyEmployee(double rate){
        this.rate = rate;
    }

    public String getFormattedrate(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.rate);
    }
}
