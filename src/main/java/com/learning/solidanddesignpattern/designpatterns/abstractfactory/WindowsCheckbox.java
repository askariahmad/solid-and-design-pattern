package com.learning.solidanddesignpattern.designpatterns.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows checkbox...");
    }
}