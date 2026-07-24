package com.example.final_project_paper_mill.Mahapara;

public class Customer {
    private int customerId;
    private String companyName;
    private String contactName;
    private String phoneNumber;
    private String deliveryAddress;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
