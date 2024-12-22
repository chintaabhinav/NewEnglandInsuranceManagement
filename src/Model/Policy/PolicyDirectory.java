/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Policy;

import java.util.ArrayList;
import Model.DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author kishorebalaji
 */
public class PolicyDirectory {

    public ArrayList<Policy> getAllPolicies() {
        ArrayList<Policy> policies = new ArrayList<>();
        String query = "SELECT * FROM Policies";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Policy policy = new Policy(
                    rs.getInt("policy_id"),
                    rs.getString("policy_name"),
                    rs.getDouble("claim_percentage"),
                    rs.getDouble("policy_amount"),
                    rs.getDouble("premium_amount"),
                    rs.getString("coverage_period"),
                    rs.getDouble("deductible_amount")
                );
                policies.add(policy);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return policies;
    }

    public boolean addPolicy(Policy policy) {
        String query = "INSERT INTO Policies (policy_name, claim_percentage, policy_amount, premium_amount, coverage_period, deductible_amount) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, policy.getPolicyName());
            stmt.setDouble(2, policy.getClaimPercentage());
            stmt.setDouble(3, policy.getPolicyAmount());
            stmt.setDouble(4, policy.getPremiumAmount());
            stmt.setString(5, policy.getCoveragePeriod());
            stmt.setDouble(6, policy.getDeductibleAmount());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePolicy(Policy policy) {
        String query = "UPDATE Policies SET policy_name = ?, claim_percentage = ?, policy_amount = ?, premium_amount = ?, coverage_period = ?, deductible_amount = ? WHERE policy_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, policy.getPolicyName());
            stmt.setDouble(2, policy.getClaimPercentage());
            stmt.setDouble(3, policy.getPolicyAmount());
            stmt.setDouble(4, policy.getPremiumAmount());
            stmt.setString(5, policy.getCoveragePeriod());
            stmt.setDouble(6, policy.getDeductibleAmount());
            stmt.setInt(7, policy.getPolicyId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletePolicy(int policyId) {
        String query = "DELETE FROM Policies WHERE policy_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, policyId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}