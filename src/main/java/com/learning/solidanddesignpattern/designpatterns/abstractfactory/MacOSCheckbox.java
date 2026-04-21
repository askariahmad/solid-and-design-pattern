package com.learning.solidanddesignpattern.designpatterns.abstractfactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a MacOS checkbox...");
    }
}