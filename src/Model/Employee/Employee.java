/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Employee;

import Model.Account.Account;

/**
 *
 * @author kishorebalaji
 */
public abstract class Employee extends Account {
    protected String ssn;
    protected int employeeId;

    private static int nextEmployeeId = 1;

    public Employee(String firstName, String lastName, String email, String ssn) {
        super(firstName, lastName, email);
        this.ssn = ssn;
        this.employeeId = nextEmployeeId++;
    }

    @Override
    public abstract void viewProfile();

    @Override
    public abstract String getRole();
}


