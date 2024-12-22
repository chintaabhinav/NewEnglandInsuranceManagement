/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer.Policy;

import Model.Customer.Customer;
import Model.Customer.Vehicle.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CustomerPolicyDirectory {

    private ArrayList<CustomerPolicy> customerPolicies;

    public CustomerPolicyDirectory() {
        this.customerPolicies = new ArrayList<>();
    }

    public ArrayList<CustomerPolicy> getCustomerPolicies() {
        return customerPolicies;
    }

    public void addCustomerPolicy(CustomerPolicy customerPolicy) {
        customerPolicies.add(customerPolicy);
    }

    public void deleteCustomerPolicy(CustomerPolicy customerPolicy) {
        customerPolicies.remove(customerPolicy);
    }

    public CustomerPolicy findCustomerPolicy(Customer customer) {
        for (CustomerPolicy customerPolicy : customerPolicies) {
            if (customerPolicy.getCustomerAccount().equals(customer)) {
                return customerPolicy;
            }
        }
        return null;
    }

    public CustomerPolicy createCustomerPolicy(Customer customer, String status, double premiumAmount, ArrayList<Vehicle> vehicles) {
        if (customer instanceof Customer) {
            CustomerPolicy existingPolicy = findCustomerPolicy(customer);
            if (existingPolicy != null) {
                // Customer already has a policy, update it
                existingPolicy.setPolicy(customer, status, premiumAmount, vehicles);
                return existingPolicy;
            } else {
                // Customer doesn't have a policy, create a new one
                CustomerPolicy newPolicy = new CustomerPolicy(customer, status, premiumAmount, vehicles);
                addCustomerPolicy(newPolicy);
                return newPolicy;
            }
        } else {
            // Handle error: Account is not a customer
            JOptionPane.showMessageDialog(null, "Error: Only customers can have policies.");
            return null;
        }
    }

    public void addVehicleToPolicy(Customer customer, Vehicle vehicle) {
        CustomerPolicy existingPolicy = findCustomerPolicy(customer);

        if (existingPolicy != null) {
            // Customer has a policy, add the vehicle
            if (existingPolicy.getPolicy().getVehicles().size() < 4) {
                existingPolicy.getPolicy().addVehicle(vehicle);
                JOptionPane.showMessageDialog(null, "Vehicle added to the policy successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Maximum limit of 4 vehicles reached for the policy.");
            }
        } else {
            // Customer doesn't have a policy
            JOptionPane.showMessageDialog(null, "Error: Customer does not have an existing policy.");
        }
    }

    public boolean customerExists(int customerId) {
        for (CustomerPolicy customerPolicy : customerPolicies) {
            if (customerPolicy.getCustomerAccount().getCustomerId() == customerId) {
                return true;
            }
        }
        return false;
    }

}
