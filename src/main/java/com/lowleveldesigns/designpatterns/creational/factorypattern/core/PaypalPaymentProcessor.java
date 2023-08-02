package com.lowleveldesigns.designpatterns.creational.factorypattern.core;

public class PaypalPaymentProcessor implements PaymentProcessor{
    @Override
    public void payment(double amount) {
        System.out.println("Payment made via Paypal");
    }
}
