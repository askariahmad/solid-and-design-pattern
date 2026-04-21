package com.learning.solidanddesignpattern.designpatterns.visitor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VisitorExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Visitor Example ---");

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        System.out.println("--- End Visitor Example ---");
    }
}