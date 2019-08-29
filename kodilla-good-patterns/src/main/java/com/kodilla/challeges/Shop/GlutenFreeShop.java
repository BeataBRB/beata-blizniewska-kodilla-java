package com.kodilla.challeges.Shop;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to GlutenFreeShop.");
        return true;
    }
}
