package com.learning.solidanddesignpattern.designpatterns.behavioral.state;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StateExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- State Example ---");

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        System.out.println("--- End State Example ---");
    }
}