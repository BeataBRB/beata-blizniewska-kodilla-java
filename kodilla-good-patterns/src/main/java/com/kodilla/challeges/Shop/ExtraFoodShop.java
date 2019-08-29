package com.kodilla.challeges.Shop;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to ExtraFoodShop.");
        return true;
    }
}
