/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.InsurancePackage;


public class StandardPackage {

    private double bodilyInjury;
    private double propertyDamage;
    private double collision;
    private double comprehensive;
    private double discountsAppliedAmount;

    public StandardPackage() {
        this.bodilyInjury = 500;
        this.propertyDamage = 1000;
        this.collision = 800;
        this.comprehensive = 600;
        this.discountsAppliedAmount = 0;
    }

    public double getBodilyInjury(int vehicleCount, double rating) {
        return bodilyInjury * vehicleCount * rating;
    }

    public double getPropertyDamage(int vehicleCount, double rating) {
        return propertyDamage * vehicleCount * rating;
    }

    public double getCollision(int vehicleCount, double rating) {
        return collision * vehicleCount * rating;
    }

    public double getComprehensive(int vehicleCount, double rating) {
        return comprehensive * vehicleCount * rating;
    }
    
     public double calculateTotalAmount(int vehicleCount, double rating, double discount) {
        double totalBodilyInjury = getBodilyInjury(vehicleCount, rating);
        double totalPropertyDamage = getPropertyDamage(vehicleCount, rating);
        double totalCollision = getCollision(vehicleCount, rating);
        double totalComprehensive = getComprehensive(vehicleCount, rating);
        
        // Calculate total amount after applying discount
        double totalAmount = totalBodilyInjury + totalPropertyDamage + totalCollision + totalComprehensive;
        totalAmount -= discount; // Subtract the discount

        return totalAmount;
    }
}
