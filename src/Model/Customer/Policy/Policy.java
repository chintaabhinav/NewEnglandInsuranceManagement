/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer.Policy;

import Model.Customer.Quote.Quote;
import Model.Customer.Vehicle.Vehicle;
import Model.InsurancePackage.PremiumPackage;
import Model.InsurancePackage.StandardPackage;
import java.util.ArrayList;


public class Policy {

    private String policyId;
    private String status;
    private double premiumAmount;
    private ArrayList<Vehicle> vehicles;
    private static int nextPolicyNumber = 1;
    private PremiumPackage premiumPackage;
    private StandardPackage standardPackage;
    private String packageType;
    private Quote quote;

    public static String generatePolicyId() {
        return "p" + nextPolicyNumber++;
    }

    public Policy(String status, double premiumAmount, ArrayList<Vehicle> vehicles) {
        this.policyId = generatePolicyId();
        setStatus(status);
        this.premiumAmount = premiumAmount;
        this.vehicles = vehicles;
        this.premiumPackage = new PremiumPackage();
        this.standardPackage = new StandardPackage();
        this.packageType = "N/A";  // standard or premium
        this.quote = new Quote();
    }

    public void setStatus(String status) {
        // policy are "active" or "inactive"
        if (status.equalsIgnoreCase("expired") || status.equalsIgnoreCase("issued") || status.equalsIgnoreCase("renewed")|| status.equalsIgnoreCase("requested")) {
            this.status = status.toLowerCase();
        } else {
            throw new IllegalArgumentException("Invalid status. Status can be 'active' or 'inactive'.");
        }
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getStatus() {
        return status;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public String getPackageType() {
        return packageType;
    }
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public PremiumPackage getPremiumPackage() {
        return premiumPackage;
    }
    public StandardPackage getStandardPackage() {
        return standardPackage;
    }

    public void setPremiumPackage(PremiumPackage premiumPackage) {
        this.premiumPackage = premiumPackage;
    }
    public void setStandardPackage(StandardPackage standardPackage) {
        this.standardPackage = standardPackage;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
    
    

    @Override
    public String toString() {
        return policyId;
    }
}
