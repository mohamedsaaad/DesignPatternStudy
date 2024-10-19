package org.example.behavioral.strategy.violation;

public class Checkout {
    public void processPayment(double amount, PaymentType type){
        if(type.equals(PaymentType.VISA_CARD)){
            System.out.println("Processing visa card payment with value: "+amount);
            System.out.println("calculating the fees for visa card Payment");
        } else if(type.equals(PaymentType.PAYPAL)){
            System.out.println("Processing paypal payment with value: "+amount);
            System.out.println("calculating the fees for paypal Payment");
        }
        else if(type.equals(PaymentType.BANK_TRANSFER)){
            System.out.println("Processing bank transfer with value: "+amount);
        }
    }
}
