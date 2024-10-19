package org.example.behavioral.strategy.violation;

public class Main {
    public static void main(String[] args) {
        Product product= new Product("Iphone",55000);
        Checkout checkout= new Checkout();
        checkout.processPayment(product.calculatePrice(CustomerType.PREMIUM),PaymentType.BANK_TRANSFER);
    }
}
