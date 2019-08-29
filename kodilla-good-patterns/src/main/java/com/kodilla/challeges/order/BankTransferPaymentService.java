package com.kodilla.challeges.order;

public class BankTransferPaymentService implements PaymentService {
    public boolean pay(Invoice invoice) {

        System.out.println("Payment has been transferred");
        return true;
    }
}
