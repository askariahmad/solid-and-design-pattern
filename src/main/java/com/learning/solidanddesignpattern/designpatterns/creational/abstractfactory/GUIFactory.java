package com.learning.solidanddesignpattern.designpatterns.creational.abstractfactory;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}