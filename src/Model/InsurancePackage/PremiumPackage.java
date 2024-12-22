/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.InsurancePackage;


public class PremiumPackage {

    private double bodilyInjury;
    private double propertyDamage;
    private double collision;
    private double comprehensive;
    private double personalInjuryProtection;
    private double roadSideAssistance;
    private double discountsAppliedAmount;

    public PremiumPackage() {
        // Set default values or initialize as needed
        this.bodilyInjury = 1000;
        this.propertyDamage = 1500;
        this.collision = 1200;
        this.comprehensive = 1000;
        this.personalInjuryProtection = 800;
        this.roadSideAssistance = 1200;
        this.discountsAppliedAmount = 0;
    }

    public double calculateTotalPremium() {
        double totalPremium = bodilyInjury + propertyDamage + collision
                + comprehensive + personalInjuryProtection + roadSideAssistance - discountsAppliedAmount;
        return totalPremium;
    }

    public double getBodilyInjury(int vehicleCount, double rating) {
        this.bodilyInjury = bodilyInjury * vehicleCount * rating;
        return bodilyInjury;
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

    public double getPersonalInjuryProtection(int vehicleCount, double rating) {
        return personalInjuryProtection * vehicleCount * rating;
    }

    public double getRoadSideAssistance(int vehicleCount, double rating) {
        return roadSideAssistance * vehicleCount * rating;
    }

    public double getDiscountsAppliedAmount(int vehicleCount, double rating) {
        return discountsAppliedAmount * vehicleCount * rating;
    }

    public double calculateTotalAmount(int vehicleCount, double rating, double discount) {
        double totalBodilyInjury = getBodilyInjury(vehicleCount, rating);
        double totalPropertyDamage = getPropertyDamage(vehicleCount, rating);
        double totalCollision = getCollision(vehicleCount, rating);
        double totalComprehensive = getComprehensive(vehicleCount, rating);
        double totalPersonalInjuryProtection = getPersonalInjuryProtection(vehicleCount, rating);
        double totalRoadSideAssistance = getRoadSideAssistance(vehicleCount, rating);

        // Calculate total amount after applying discount
        double totalAmount = totalBodilyInjury + totalPropertyDamage + totalCollision
                + totalComprehensive + totalPersonalInjuryProtection + totalRoadSideAssistance;
        totalAmount -= discount; // Subtract the discount

        return totalAmount;
    }
}
