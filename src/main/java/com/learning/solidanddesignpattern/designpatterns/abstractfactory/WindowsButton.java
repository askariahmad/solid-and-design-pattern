package com.learning.solidanddesignpattern.designpatterns.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Windows button...");
    }
}