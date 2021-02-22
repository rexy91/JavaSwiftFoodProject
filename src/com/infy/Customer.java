package com.infy;

public class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    public Customer(String customerId, String customerName, long contactNumber, String address){
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public void displayCustomerDetails(){
        System.out.println(this.customerId + this.customerName +this.address + this.contactNumber);
    }
}
