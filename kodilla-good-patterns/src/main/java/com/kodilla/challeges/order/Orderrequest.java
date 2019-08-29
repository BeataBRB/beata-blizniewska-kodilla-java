package com.kodilla.challeges.order;

public class Orderrequest {
    private User user;
    private Invoice invoice;

    public Orderrequest(User user, Invoice invoice) {
        this.user = user;
        this.invoice = invoice;
    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
