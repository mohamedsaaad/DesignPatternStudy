package org.example.behavioral.strategy.practice.paymentStrategies;

public class BankTransferPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer with value: "+amount);
    }
}
