package com.learning.solidanddesignpattern.designpatterns.decorator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DecoratorExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Decorator Example ---");

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        System.out.println("--- End Decorator Example ---");
    }
}