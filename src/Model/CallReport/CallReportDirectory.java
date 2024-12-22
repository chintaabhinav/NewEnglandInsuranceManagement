package Model.CallReport;

import Model.DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Manages Call Report records in the database.
 * 
 * @author kishorebalaji
 */
public class CallReportDirectory {

    // Retrieve all call reports
    public ArrayList<CallReport> getAllCallReports() {
        ArrayList<CallReport> callReports = new ArrayList<>();
        String query = "SELECT * FROM CallReports";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                CallReport callReport = new CallReport(
                    rs.getInt("id"),
                    rs.getString("customer_name"),
                    rs.getString("customer_email"),
                    rs.getString("report_details"),
                    rs.getString("created_at")
                );
                callReports.add(callReport);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return callReports;
    }

    // Add a new call report
    public boolean addCallReport(CallReport callReport) {
        String query = "INSERT INTO CallReports (customer_name, customer_email, report_details) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, callReport.getCustomerName());
            stmt.setString(2, callReport.getCustomerEmail());
            stmt.setString(3, callReport.getReportDetails());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Update an existing call report
    public boolean updateCallReport(CallReport callReport) {
        String query = "UPDATE CallReports SET customer_name = ?, customer_email = ?, report_details = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, callReport.getCustomerName());
            stmt.setString(2, callReport.getCustomerEmail());
            stmt.setString(3, callReport.getReportDetails());
            stmt.setInt(4, callReport.getReportId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete a call report by ID
    public boolean deleteCallReport(int reportId) {
        String query = "DELETE FROM CallReports WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, reportId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
