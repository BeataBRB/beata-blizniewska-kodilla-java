package com.kodilla.challeges.order;

public class ProductOrderService implements OrderService {
    public boolean createOrder(final User user, final Invoice invoice) {
        System.out.println("Order for " +user.getFirstName() +" "+ user.getFamilyName() + " Invoice number " + invoice.getId());
        return true;
    }
}
