package Model.CallReport;

/**
 * Represents a Call Report entity.
 * 
 * @author kishorebalaji
 */
public class CallReport {
    private int reportId;
    private String customerName;
    private String customerEmail;
    private String reportDetails;
    private String createdAt;

    public CallReport(int reportId, String customerName, String customerEmail, String reportDetails, String createdAt) {
        this.reportId = reportId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.reportDetails = reportDetails;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
