package com.learning.solidanddesignpattern.designpatterns.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Observer Example ---");

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        System.out.println("--- End Observer Example ---");
    }
}