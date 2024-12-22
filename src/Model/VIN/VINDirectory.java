package Model.VIN;

import Model.DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author kishorebalaji
 */
public class VINDirectory {

    public ArrayList<VIN> getAllVINs() {
        ArrayList<VIN> vinList = new ArrayList<>();
        String query = "SELECT * FROM VINDatabase";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                VIN vin = new VIN(
                    rs.getInt("vin_id"),
                    rs.getString("vin_number")
                );
                vinList.add(vin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vinList;
    }

    public boolean addVIN(VIN vin) {
        String query = "INSERT INTO VINDatabase (vin_number) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, vin.getVinNumber());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteVIN(int vinId) {
        String query = "DELETE FROM VINDatabase WHERE vin_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, vinId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
