package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OcpExample implements CommandLineRunner {

    private final PaymentProcessor paymentProcessor;

    public OcpExample(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- OCP Driver ---");
        paymentProcessor.processPayment("CreditCard");
        paymentProcessor.processPayment("PayPal");
        paymentProcessor.processPayment("Bitcoin");
        System.out.println("--- End OCP Driver ---");
    }
}