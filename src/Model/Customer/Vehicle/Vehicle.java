/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Customer.Vehicle;


public class Vehicle {
    private String vehicleType;
    private String vin;
    private int year;
    private String make;
    private String model;
    private String ownership;
    private String use;
    private String registeration;

    public Vehicle(String vehicleType, String vin, int year, String make, String model) {
        this.vehicleType = vehicleType;
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.ownership = "N/A";
        this.use = "N/A";
        this.registeration = "N/A";
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnership() {
        return ownership;
    }
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getUse() {
        return use;
    }
    public void setUse(String use) {
        this.use = use;
    }

    public String getRegisteration() {
        return registeration;
    }
    public void setRegisteration(String registeration) {
        this.registeration = registeration;
    }
    
    @Override
    public String toString() {
        return vin;
    }
}