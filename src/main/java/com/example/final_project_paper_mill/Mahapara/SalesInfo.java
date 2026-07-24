package com.example.final_project_paper_mill.Mahapara;
public class SalesInfo {
    private int salesId;
    private int totalOrders;
    private double totalRevenue;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @Override
    public String toString() {
        return "SalesInfo{" +
                "salesId=" + salesId +
                ", totalOrders=" + totalOrders +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
