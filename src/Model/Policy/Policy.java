/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Policy;

/**
 *
 * @author kishorebalaji
 */
public class Policy {
    private int policyId;
    private String policyName;
    private double claimPercentage;
    private double policyAmount;
    private double premiumAmount;
    private String coveragePeriod;
    private double deductibleAmount;

    public Policy(int policyId, String policyName, double claimPercentage, double policyAmount,
                  double premiumAmount, String coveragePeriod, double deductibleAmount) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.claimPercentage = claimPercentage;
        this.policyAmount = policyAmount;
        this.premiumAmount = premiumAmount;
        this.coveragePeriod = coveragePeriod;
        this.deductibleAmount = deductibleAmount;
    }

    public int getPolicyId() {
        return policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public double getClaimPercentage() {
        return claimPercentage;
    }

    public void setClaimPercentage(double claimPercentage) {
        this.claimPercentage = claimPercentage;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getCoveragePeriod() {
        return coveragePeriod;
    }

    public void setCoveragePeriod(String coveragePeriod) {
        this.coveragePeriod = coveragePeriod;
    }

    public double getDeductibleAmount() {
        return deductibleAmount;
    }

    public void setDeductibleAmount(double deductibleAmount) {
        this.deductibleAmount = deductibleAmount;
    }
}