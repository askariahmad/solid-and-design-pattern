package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.stereotype.Component;

@Component("Bitcoin")
public class BitcoinPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin payment...");
    }
}