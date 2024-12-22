/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Thirdparty.POLK;

import Model.Customer.Vehicle.Vehicle;
import java.util.ArrayList;


public class VehicleListWithAddress {

    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private ArrayList<Vehicle> vehicles;

    // Constructor
    public VehicleListWithAddress(String streetAddress, String city, String state, String zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.vehicles = new ArrayList<>();
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // Other methods as needed
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String vin) {
        vehicles.removeIf(vehicle -> vehicle.getVin().equals(vin));
    }

    @Override
    public String toString() {
        // Customize this method based on your requirements
        return "VehicleListWithAddress{"
                + "streetAddress='" + streetAddress + '\''
                + ", city='" + city + '\''
                + ", state='" + state + '\''
                + ", zip='" + zip + '\''
                + ", vehicles=" + vehicles
                + '}';
    }
}
