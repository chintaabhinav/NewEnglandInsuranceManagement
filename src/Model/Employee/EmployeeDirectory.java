/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Employee;

import java.util.ArrayList;

/**
 *
 * @author kishorebalaji
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public Employee createEmployee(String firstName, String lastName, String email, String ssn, String role) {
        Employee newEmployee;
        switch (role.toLowerCase()) {
            case "admin":
                newEmployee = new Admin(firstName, lastName, email, ssn);
                break;
            case "agent":
                newEmployee = new Agent(firstName, lastName, email, ssn);
                break;
            case "underwriter":
                newEmployee = new Underwriter(firstName, lastName, email, ssn);
                break;
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
        employees.add(newEmployee);
        return newEmployee;
    }

    public Employee findEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getAccountId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(int employeeId) {
        Employee employeeToRemove = findEmployee(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        }
    }

    public void printAllEmployeeProfiles() {
        for (Employee employee : employees) {
            employee.viewProfile();
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
