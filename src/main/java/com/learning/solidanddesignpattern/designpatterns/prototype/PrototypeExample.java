package com.learning.solidanddesignpattern.designpatterns.prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrototypeExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Prototype Example ---");

        Shape circle = new Circle(10);
        Shape clonedCircle = circle.clone();

        Shape rectangle = new Rectangle(20, 30);
        Shape clonedRectangle = rectangle.clone();

        circle.draw();
        clonedCircle.draw();

        rectangle.draw();
        clonedRectangle.draw();

        System.out.println("--- End Prototype Example ---");
    }
}