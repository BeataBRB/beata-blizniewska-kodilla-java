package com.kodilla.challeges.Shop;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop.");
        return true;
    }
}
