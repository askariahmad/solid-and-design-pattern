package com.learning.solidanddesignpattern.designpatterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows checkbox...");
    }
}