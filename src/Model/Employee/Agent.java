/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Employee;

/**
 *
 * @author kishorebalaji
 */
public class Agent extends Employee {
    public Agent(String firstName, String lastName, String email, String ssn) {
        super(firstName, lastName, email, ssn);
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewing agent profile: " + firstName + " " + lastName+
                " (Account ID: " + getAccountId() + ", Employee ID: " + employeeId + ")");
        // Additional agent-specific view logic
    }

    @Override
    public String getRole() {
        return "Agent";
    }
}

