package com.learning.solidanddesignpattern.designpatterns.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Chain of Responsibility Example ---");

        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);

        handlerA.handle(new Request("A"));
        handlerA.handle(new Request("B"));
        handlerA.handle(new Request("C"));

        System.out.println("--- End Chain of Responsibility Example ---");
    }
}