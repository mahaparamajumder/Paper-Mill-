package com.example.final_project_paper_mill.Mahapara;

import java.time.LocalDate;

public class ProductionRecord {

    private String recordId;
    private String batchNumber;
    private double netWeight;
    private LocalDate date;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProductionRecord{" +
                "recordId='" + recordId + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", netWeight=" + netWeight +
                ", date=" + date +
                '}';
    }
}
