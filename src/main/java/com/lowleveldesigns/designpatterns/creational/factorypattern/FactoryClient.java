package com.lowleveldesigns.designpatterns.creational.factorypattern;

import com.lowleveldesigns.designpatterns.creational.factorypattern.core.PaymentProcessor;
import com.lowleveldesigns.designpatterns.creational.factorypattern.factory.PaymentProcessorFactory;


/*
* Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
* The Factory Method separates product construction code from the code that actually uses the product.
* Therefore, it’s easier to extend the product construction code independently of the rest of the code.
*
* */
public class FactoryClient {
    public static void main(String[] args) throws Exception {
        PaymentProcessorFactory paymentProcessorFactory = new PaymentProcessorFactory();
        PaymentProcessor paymentProcessor1 = paymentProcessorFactory.getPaymentProcessor("creditcard");
        PaymentProcessor paymentProcessor2 = paymentProcessorFactory.getPaymentProcessor("paypal");
//        PaymentProcessor paymentProcessor3 = paymentProcessorFactory.getPaymentProcessor("randomPayment");
        paymentProcessor1.payment(120);
        paymentProcessor2.payment(100);
//        paymentProcessor1.payment(120);

    }
}
