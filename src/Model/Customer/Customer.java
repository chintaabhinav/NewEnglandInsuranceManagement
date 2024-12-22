/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.Account.Account;

/**
 *
 * @author kishorebalaji
 */
public class Customer extends Account {

    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String dob;
    private String phone;
    private double rating;
    private int customerId;

    private static int nextCustomerId = 1;

    public Customer(String firstName, String lastName, String email, String streetAddress,
            String city, String state, String zip, String dob, String phone) {
        super(firstName, lastName, email);
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.dob = dob;
        this.phone = phone;
        this.rating = 1;
        this.customerId = nextCustomerId++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public double getRating() {
        return rating;
    }
    
    
    
    @Override
    public Account getAccount() {
        return this;
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewing customer profile: " + firstName + " " + lastName
                + " (Account ID: " + getAccountId() + ", Customer ID: " + customerId + ")");
        // Additional customer-specific view logic
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return String.valueOf(customerId);
    }

}
