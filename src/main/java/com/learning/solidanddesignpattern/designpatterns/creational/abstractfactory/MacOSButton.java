package com.learning.solidanddesignpattern.designpatterns.creational.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a MacOS button...");
    }
}