/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Customer;

import java.util.ArrayList;

/**
 *
 * @author kishorebalaji
 */

public class CustomerDirectory {
    private ArrayList<Customer> customers;

    public CustomerDirectory() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Modified method to create and return a new Customer with additional values
    public Customer createCustomer(String firstName, String lastName, String email,
                                   String streetAddress, String city, String state,
                                   String zip, String dob, String phone) {
        Customer newCustomer = new Customer(firstName, lastName, email,
                streetAddress, city, state, zip, dob, phone);
        customers.add(newCustomer);
        return newCustomer;
    }

    public Customer findCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getAccountId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public void deleteCustomer(int customerId) {
        Customer customerToRemove = findCustomer(customerId);
        if (customerToRemove != null) {
            customers.remove(customerToRemove);
        }
    }

    public void printAllCustomerProfiles() {
        for (Customer customer : customers) {
            customer.viewProfile();
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
