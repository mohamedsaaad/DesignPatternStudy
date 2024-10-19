package org.example.behavioral.strategy.practice.paymentStrategies;

public class VisaPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing visa card payment with value: "+amount);
        System.out.println("calculating the fees for visa card Payment");
    }
}
