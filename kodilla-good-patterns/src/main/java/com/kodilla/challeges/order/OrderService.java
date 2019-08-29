package com.kodilla.challeges.order;

public interface OrderService {
    boolean createOrder(final User user, final Invoice invoice);
}
