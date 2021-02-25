package com.infy;

public class Tester {
    public static void main(String[] args){
        // Type then variable name:
        Customer customer1 = new Customer("1","Yuho",3472596197L,"1825 Altantic Ave");
        System.out.println(customer1.payBill(100));
        
        //Display customer info:
        customer1.displayCustomerDetails();
        //Updating name:

        customer1.updateCustomerName("Yu Hao");
        // Since customer 's name attribute is private, which is not visible outside of Customer class,
        // Here we are inside tester class, so we need a static getting to get the customer name.

        System.out.println(customer1.customerName()); // Should be "Yu Hao".

        // Order instances:
        Order order1 = new Order(); //Using parameterless constructor.
        System.out.println("Status of order1: " + order1.status());
        Order order2 = new Order(1001, "Garlic Shrimp");
        System.out.println("Status of order2: " + order2.status());
        System.out.println("Id of order2: " + order2.orderId());
        System.out.println("Items ordered in order 2: " + order2.orderedFoods());



        // Creates Restaurant Object:
        Restaurant macDonald = new Restaurant("McDonald's", 9988787878L, "D089, St. Louis Street, Springfield", 4.1f);
        macDonald.displayRestaurantDetails();

    }
}