/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer.Policy;

import Model.Customer.Customer;
import Model.Customer.Vehicle.Vehicle;
import java.util.ArrayList;


public class CustomerPolicy {

    private Customer customerAccount;
    private Policy policy;

    public CustomerPolicy(Customer customerAccount, String status, double premiumAmount, ArrayList<Vehicle> vehicles) {
        this.customerAccount = customerAccount;
        this.policy = new Policy(status, premiumAmount, vehicles);
    }

    public Customer getCustomerAccount() {
        return customerAccount;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Customer customer, String status, double premiumAmount, ArrayList<Vehicle> vehicles) {
        this.customerAccount = customer;
        this.policy.setStatus(status);
        this.policy.setPremiumAmount(premiumAmount);
        this.policy.setVehicles(vehicles);
    }

    @Override
    public String toString() {
        return policy.getPolicyId();
    }
}
