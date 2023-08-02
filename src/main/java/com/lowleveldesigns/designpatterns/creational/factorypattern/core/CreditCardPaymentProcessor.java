package com.lowleveldesigns.designpatterns.creational.factorypattern.core;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void payment(double amount) {
        System.out.println("Payment is made via Credit Card");
    }
}
