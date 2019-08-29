package com.kodilla.challeges.Shop;

public class OrderProcessor {
    public void processOrder(Shop shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("The order has been accepted for implementation");
        } else {
            System.out.println("\n" + "Order could not be completed. Please contact support.");
        }
    }
}
