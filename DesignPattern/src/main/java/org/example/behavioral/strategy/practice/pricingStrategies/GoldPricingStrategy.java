package org.example.behavioral.strategy.practice.pricingStrategies;

public class GoldPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(double price) {
        return price * 0.9;
    }
}
