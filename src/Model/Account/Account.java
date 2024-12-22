/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Account;


/**
 *
 * @author ABHINAVCHINTA
 */
public abstract class Account {

    protected int accountId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String Role;
    protected AccountCredentials accountCredentials;

    private static int nextAccountId = 1;

    public Account(String firstName, String lastName, String email) {
        this.accountId = nextAccountId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.Role = Role;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return (firstName + ' ' + lastName);
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getEmail() {
        return email;
    }

    public Account getAccount() {
        return (this);
    }

    public abstract String getRole();

    public abstract void viewProfile();

    public AccountCredentials getAccountCredentials() {
        return accountCredentials;
    }

    public void setUserAccountCredentials(AccountCredentials accountCredentials) {
        this.accountCredentials = accountCredentials;
    }

    public static int getNextAccountId() {
        return nextAccountId;
    }

    public static void setNextAccountId(int nextAccountId) {
        Account.nextAccountId = nextAccountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountCredentials(AccountCredentials accountCredentials) {
        this.accountCredentials = accountCredentials;
    }

    public void setAccountId(String accountId) {

    }

    // Subclass representing a customer account
    public static class CustomerAccount extends Account {

        public CustomerAccount(String firstName, String lastName, String email) {
            super(firstName, lastName, email);
        }

        @Override
        public String getRole() {
            return "Customer"; // Role specific to a customer account
        }

        @Override
        public void viewProfile() {
            // Implement how a customer's profile should be viewed
            // This method can display the customer's information in a UI or print it to the console
        }

        // Add any additional methods or properties specific to a customer account
    }
}
