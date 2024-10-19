package org.example.behavioral.strategy.practice.pricingStrategies;

public class RegularPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
