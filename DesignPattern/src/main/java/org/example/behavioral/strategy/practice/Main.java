package org.example.behavioral.strategy.practice;

import org.example.behavioral.strategy.practice.paymentStrategies.BankTransferPaymentProcessor;
import org.example.behavioral.strategy.practice.paymentStrategies.PaypalPaymentProcessor;
import org.example.behavioral.strategy.practice.paymentStrategies.VisaPaymentProcessor;
import org.example.behavioral.strategy.practice.pricingStrategies.GoldPricingStrategy;
import org.example.behavioral.strategy.practice.pricingStrategies.PremiumPricingStrategy;
import org.example.behavioral.strategy.practice.pricingStrategies.RegularPricingStrategy;

public class Main {
    public static void main(String[] args) {
        Product wallet=new Product("wallet",120,new RegularPricingStrategy());
        Product jacket=new Product("jacket",1000,new GoldPricingStrategy());
        Product phone=new Product("phone",5000,new PremiumPricingStrategy());

        Checkout walletCheckout= new Checkout(new PaypalPaymentProcessor());
        Checkout jacketCheckout= new Checkout(new BankTransferPaymentProcessor());
        Checkout phoneCheckout= new Checkout(new VisaPaymentProcessor());

        walletCheckout.processPayment(wallet.calculatePrice());
        jacketCheckout.processPayment(jacket.calculatePrice());
        phoneCheckout.processPayment(phone.calculatePrice());

    }
}
