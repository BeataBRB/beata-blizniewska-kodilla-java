package com.kodilla.challeges.Shop;

import java.math.BigDecimal;

public class Application {
    public static void main(String args []) {

        Product product1 = new Product("apple", 1);
        Product product2 = new Product("gluten free bread", 1);
        Product product3 = new Product("vitamin", 1);

        Item item1 = new Item(product1, new BigDecimal(1.50));
        Item item2 = new Item(product2, new BigDecimal(6.50));
        Item item3 = new Item(product3, new BigDecimal(15));

        OrderProcessor processor = new OrderProcessor();

        processor.processOrder(new ExtraFoodShop(), item3);
        processor.processOrder(new HealthyShop(), item1);
        processor.processOrder(new GlutenFreeShop(), item2);
    }
}
