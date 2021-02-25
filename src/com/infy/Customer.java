package com.infy;

public class Customer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private String address;

    public Customer(String customerId, String customerName, long contactNumber, String address){
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }



    //Getters
    public String customerName(){
        return this.customerName;
    }

    public String customerId(){
        return this.customerId;
    }

    public long getContactNumber(){
        return this.contactNumber;
    }
    
    public String getAddress(){
        return this.address;
    }

    //Setters:

    public void displayCustomerDetails(){
        System.out.println("Displaying customer details" + "\nCustomer ID:" + this.customerId +
        "\nCustomer name:" + this.customerName +
        "\nContact Number:" + this.contactNumber +
        "\nAddress: "+ this.address
        );
    }

    public void updateCustomerDetails(){
        // This is setter.
    }

    public double payBill(double totalPrice){
        double discountPercentage = 10;
        System.out.println("Calculating final amount to be paid....");
        double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
                                    //Because customerName is made private, we need this to access it.
        return priceAfterDiscount;
    }

    public void updateCustomerName(String newName){
            this.customerName = newName;
    }

}
