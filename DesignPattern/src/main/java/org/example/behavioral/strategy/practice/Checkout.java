package org.example.behavioral.strategy.practice;

import org.example.behavioral.strategy.practice.paymentStrategies.PaymentProcessor;

public class Checkout {
    PaymentProcessor paymentProcessor;
    public Checkout(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void processPayment(double amount){
        paymentProcessor.processPayment(amount);
    }
}
