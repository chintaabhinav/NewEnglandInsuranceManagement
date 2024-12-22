/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer.Quote;

import Model.Customer.Payment.PaymentCard;
import Model.Customer.Vehicle.Vehicle;
import Model.InsurancePackage.PremiumPackage;
import Model.InsurancePackage.StandardPackage;
import java.util.ArrayList;


public class Quote {

    private String quoteId;
    private String status;
    private double premiumAmount;
    private String reason;
    private ArrayList<Vehicle> vehicles;
    private static int nextQuoteNumber = 1;
    private PremiumPackage premiumPackage;
    private StandardPackage standardPackage;
    private String packageType;
    private PaymentCard paymentCard;
    private String paymentStatus;

    public static String generateQuoteId() {
        return "q" + nextQuoteNumber++;
    }

    public Quote(String status, double premiumAmount) {
        this.quoteId = generateQuoteId();
        setStatus(status);
        this.premiumAmount = premiumAmount;
        this.reason = "N/A";
        this.vehicles = new ArrayList<>();
        this.premiumPackage = new PremiumPackage();
        this.standardPackage = new StandardPackage();
        this.packageType = "N/A";  // standard or premium
        this.paymentCard = new PaymentCard();
        paymentStatus = "incomplete"; //incomplete or completed
    }

    public Quote() {
        this.vehicles = new ArrayList<>();
        this.premiumPackage = new PremiumPackage();
        this.standardPackage = new StandardPackage();
        this.paymentCard = new PaymentCard();

    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("pending") || status.equalsIgnoreCase("unauthorized") || status.equalsIgnoreCase("completed")) {
            this.status = status.toLowerCase();
        } else {
            throw new IllegalArgumentException("Invalid status. Status can be 'pending', 'unauthorized', or 'completed'.");
        }
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(PaymentCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        if (vehicles.size() < 4) {
            vehicles.add(vehicle);
            return vehicle;
        } else {
            return null;
        }
    }

    public String getQuoteId() {
        return quoteId;
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

    public void setPremiumPackage(PremiumPackage premiumPackage) {
        this.premiumPackage = premiumPackage;
    }

    public void setStandardPackage(StandardPackage standardPackage) {
        this.standardPackage = standardPackage;
    }

    public PremiumPackage getPremiumPackage() {
        return premiumPackage;
    }

    public StandardPackage getStandardPackage() {
        return standardPackage;
    }

    public void removeVehicle(String vin) {
        // Iterate through the list of vehicles
        for (Vehicle vehicle : vehicles) {
            // Check if the VIN matches
            if (vehicle.getVin().equalsIgnoreCase(vin)) {
                // Remove the vehicle and exit the loop
                vehicles.remove(vehicle);
                return;
            }
        }
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    @Override
    public String toString() {
        return quoteId;
    }
}
