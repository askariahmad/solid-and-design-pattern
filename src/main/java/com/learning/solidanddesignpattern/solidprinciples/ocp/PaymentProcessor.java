package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentProcessor {

    private final Map<String, Payment> payments;

    public PaymentProcessor(Map<String, Payment> payments) {
        this.payments = payments;
    }

    public void processPayment(String paymentType) {
        Payment payment = payments.get(paymentType);
        if (payment == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        payment.processPayment();
    }
}