/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author Mitch
 */
public class CustomerServices {

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.isNew = true;
        setCustomerServices(cust);

    }

    public static void setCustomerServices(Customer cust) {
        String message = "Wouild you like to hear about special deals in our area";
        if (cust.isNewCustomer()) {
            cust.sendEmail(message);
        } else {
            cust.sendEmail("Are you happy with our services?");
        }
    }
}
