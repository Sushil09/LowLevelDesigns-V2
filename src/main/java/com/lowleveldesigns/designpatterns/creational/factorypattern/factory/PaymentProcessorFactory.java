package com.lowleveldesigns.designpatterns.creational.factorypattern.factory;

import com.lowleveldesigns.designpatterns.creational.factorypattern.core.CreditCardPaymentProcessor;
import com.lowleveldesigns.designpatterns.creational.factorypattern.core.PaymentProcessor;
import com.lowleveldesigns.designpatterns.creational.factorypattern.core.PaypalPaymentProcessor;

public class PaymentProcessorFactory {
    public PaymentProcessor getPaymentProcessor(String type) throws Exception {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPaymentProcessor();
            case "paypal" -> new PaypalPaymentProcessor();
            default -> throw new Exception("Not a valid payment method");
        };
    }
}
