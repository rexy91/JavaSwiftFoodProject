package com.infy;

public class Order {
    // Because we have made these private, we need getters and setters to access them outside of this class file.
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;

    // Constructor:
    public Order(){
        status = "Ordered";
    };
    public Order(int orderId, String orderFoods){
        this.orderId = orderId;
        this.orderedFoods = orderFoods;
        // Set status to ordered when instance is created.
        status = "Ordered";
    }

    // getters
    // name them the same as attributes, so we can just do instanceObject.attribute() to get them.

    public int orderId(){
        return orderId;
    }

    public String orderedFoods(){
        return orderedFoods;
    }

    public String status(){
        return status;
    }

    public double totalPrice(){
        return totalPrice;
    }


    // Instance method should't have static keyword.
    public void calculateTotalPrice(int unitPrice){
        double serviceCharge = 0.05;
        //Since totalPrice is not local to this method, we need this.totalPrice to access current obeject's attribute.
        totalPrice = unitPrice + (unitPrice * serviceCharge);

        System.out.println("Order Details:");
        System.out.println("Order Id:" + orderId);
        System.out.println("Ordered Food:" + orderedFoods);
        System.out.println("Order Status:" + status);
        System.out.println("Total Price:" + totalPrice);

    }
}
