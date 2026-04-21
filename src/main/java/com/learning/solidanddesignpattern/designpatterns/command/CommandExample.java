package com.learning.solidanddesignpattern.designpatterns.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Command Example ---");

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();

        System.out.println("--- End Command Example ---");
    }
}