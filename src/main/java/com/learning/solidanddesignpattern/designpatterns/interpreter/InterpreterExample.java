package com.learning.solidanddesignpattern.designpatterns.interpreter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InterpreterExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Interpreter Example ---");

        Expression expression = new Plus(new Number(10), new Minus(new Number(5), new Number(2)));
        System.out.println("Result: " + expression.interpret());

        System.out.println("--- End Interpreter Example ---");
    }
}