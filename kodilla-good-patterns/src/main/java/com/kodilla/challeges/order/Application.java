package com.kodilla.challeges.order;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Orderrequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new BankTransferPaymentService(), new ProductOrderService(), new CourierDeliveryService());
        orderProcessor.process(orderRequest);

    }
}
