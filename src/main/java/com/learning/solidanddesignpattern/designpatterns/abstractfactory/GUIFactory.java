package com.learning.solidanddesignpattern.designpatterns.abstractfactory;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}