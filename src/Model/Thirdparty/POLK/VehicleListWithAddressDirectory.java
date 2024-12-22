/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Thirdparty.POLK;

import Model.Customer.Vehicle.Vehicle;
import java.util.ArrayList;


public class VehicleListWithAddressDirectory {

    private ArrayList<VehicleListWithAddress> directory;

    public VehicleListWithAddressDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<VehicleListWithAddress> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<VehicleListWithAddress> directory) {
        this.directory = directory;
    }

    public void create(String streetAddress, String city, String state, String zip, Vehicle vehicle) {
        // Check if the address combination already exists in the directory
        for (VehicleListWithAddress entry : directory) {
            if (entry.getStreetAddress().equals(streetAddress)
                    && entry.getCity().equals(city)
                    && entry.getState().equals(state)
                    && entry.getZip().equals(zip)) {
                // Address combination exists, add the vehicle to the existing list
                entry.addVehicle(vehicle);
                return;
            }
        }

        // Address combination does not exist, create a new entry in the directory
        VehicleListWithAddress newEntry = new VehicleListWithAddress(streetAddress, city, state, zip);
        newEntry.addVehicle(vehicle);
        directory.add(newEntry);
    }

    // Function to retrieve the list of vehicles based on address
    public ArrayList<Vehicle> getVehicles(String streetAddress, String city, String state, String zip) {
        for (VehicleListWithAddress entry : directory) {
            if (entry.getStreetAddress().equals(streetAddress)
                    && entry.getCity().equals(city)
                    && entry.getState().equals(state)
                    && entry.getZip().equals(zip)) {
                // Address combination exists, return the list of vehicles
                return entry.getVehicles();
            }
        }

        // Address combination does not exist, return an empty list
        return new ArrayList<>();
    }

    public void removeVehicle(String streetAddress, String city, String state, String zip, String vin) {
        for (VehicleListWithAddress entry : directory) {
            if (entry.getStreetAddress().equals(streetAddress)
                    && entry.getCity().equals(city)
                    && entry.getState().equals(state)
                    && entry.getZip().equals(zip)) {
                // Address combination exists, remove the vehicle with the specified VIN
                entry.removeVehicle(vin);
                return;
            }
        }
    }
}
