package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.stereotype.Component;

@Component("PayPal")
public class PayPalPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}