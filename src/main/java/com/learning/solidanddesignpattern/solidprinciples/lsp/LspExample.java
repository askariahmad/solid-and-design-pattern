package com.learning.solidanddesignpattern.solidprinciples.lsp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LspExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- LSP Driver ---");

        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.swim();

        System.out.println("--- End LSP Driver ---");
    }
}