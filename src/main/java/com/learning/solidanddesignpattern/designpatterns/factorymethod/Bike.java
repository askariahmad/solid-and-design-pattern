package com.learning.solidanddesignpattern.designpatterns.factorymethod;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}