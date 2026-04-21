package com.learning.solidanddesignpattern.designpatterns.creational.abstractfactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AbstractFactoryExample implements CommandLineRunner {

    private void createUI(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Abstract Factory Example ---");

        createUI(new WindowsFactory());
        createUI(new MacOSFactory());

        System.out.println("--- End Abstract Factory Example ---");
    }
}