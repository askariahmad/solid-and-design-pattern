package com.learning.solidanddesignpattern.designpatterns.templatemethod;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TemplateMethodExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Template Method Example ---");

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        System.out.println("--- End Template Method Example ---");
    }
}