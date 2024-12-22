package Model.VIN;

/**
 *
 * @author kishorebalaji
 */
public class VIN {
    private int vinId;
    private String vinNumber;

    public VIN(int vinId, String vinNumber) {
        this.vinId = vinId;
        this.vinNumber = vinNumber;
    }

    public int getVinId() {
        return vinId;
    }

    public String getVinNumber() {
        return vinNumber;
    }
}
