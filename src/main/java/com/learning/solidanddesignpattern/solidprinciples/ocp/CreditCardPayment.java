package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.stereotype.Component;

@Component("CreditCard")
public class CreditCardPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}