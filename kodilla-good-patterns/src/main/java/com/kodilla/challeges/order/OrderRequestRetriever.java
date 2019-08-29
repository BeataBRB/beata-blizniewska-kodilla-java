package com.kodilla.challeges.order;

import java.math.BigDecimal;

public class OrderRequestRetriever {
    public Orderrequest retrieve() {
        UsersAddress usersAddress = new UsersAddress("Pruszcz Gdański", "83-000", "Narutowicza", "1");

        User user = new User("user123", "Patryk", "Kowalski", usersAddress);

        Product product1 = new Product("Lego Toy");
        Product product2 = new Product("Scooter");

        Item item1 = new Item(1, product1, new BigDecimal("123"), 1, new BigDecimal("123"));
        Item item2 = new Item(2, product2, new BigDecimal("250"), 1, new BigDecimal("250"));

        Invoice invoice = new Invoice(123456);

        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);

        return new Orderrequest(user, invoice);
    }
}
