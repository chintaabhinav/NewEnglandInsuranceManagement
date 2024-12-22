/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Account.Account;
import Model.Account.AccountCredentials;
import Model.Account.AccountCredentialsDirectory;
import Model.Account.AccountDirectory;
import Model.Customer.Customer;
import Model.Customer.CustomerDirectory;
import Model.Customer.Payment.PaymentCard;
import Model.Customer.Policy.CustomerPolicy;
import Model.Customer.Policy.CustomerPolicyDirectory;
import Model.Customer.Vehicle.Vehicle;
import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.InsurancePackage.PremiumPackage;
import Model.Thirdparty.PAYMENT.PaymentCardDirectory;
import Model.Thirdparty.POLK.VehicleListWithAddressDirectory;
import Model.Thirdparty.VIN.VINDirectory;
import java.util.ArrayList;

/**
 *
 * @author kishorebalaji
 */
class InsuranceIntialization {

    static InsuranceModel initialize() {
        InsuranceModel BIC = new InsuranceModel("Intial Data");
        //------Create Employees------
        EmployeeDirectory employeeDirectory = BIC.getEmployeeDirectory();
        //Admin
        //------Create Customers------
        CustomerDirectory customerDirectory = BIC.getCustomerDirectory();
        //Creating logins for accounts
        AccountCredentialsDirectory accountCredentialsDirectory = BIC.getAccountCredentialsDirectory();
        //Admin
        // Customer
        //Adding accounts to account directory
        AccountDirectory accountDirectory = BIC.getAccountDirectory();
        //Adding a quote
        //Adding a policy
        //#1
        CustomerPolicyDirectory customerPolicyDirectory = BIC.getCustomerPolicyDirectory();
        //VIN Directory
        VINDirectory vinDirectory = BIC.getvINDirectory();
        return BIC;

    }

}
