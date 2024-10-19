package org.example.behavioral.strategy.practice.paymentStrategies;

public class PaypalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment with value: "+amount);
        System.out.println("calculating the fees for paypal Payment");
    }
}
