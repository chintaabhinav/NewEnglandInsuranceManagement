/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Thirdparty.VIN;

import java.util.ArrayList;


public class VINDirectory {
    private ArrayList<String> vinList;

    public VINDirectory() {
        this.vinList = new ArrayList<>();
    }

    public ArrayList<String> getVinList() {
        return vinList;
    }

    public void addVin(String vin) {
        vinList.add(vin);
    }

    public void removeVin(String vin) {
        vinList.remove(vin);
    }

    public boolean isVinExists(String vin) {
        return vinList.contains(vin);
    }

    public String findVin(String vin) {
        if (vinList.contains(vin)) {
            return vin;
        } else {
            return null;
        }
    }

    public int getVinCount() {
        return vinList.size();
    }

}
