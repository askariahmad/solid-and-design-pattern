package com.learning.solidanddesignpattern.designpatterns.flyweight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FlyweightExample implements CommandLineRunner {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Flyweight Example ---");

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            // The following line would require a GUI to actually draw the circle
            // circle.draw(g, getRandomX(), getRandomY(), 100, 100, getRandomColor());
        }

        System.out.println("--- End Flyweight Example ---");
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private int getRandomY() {
        return (int) (Math.random() * 100);
    }
}