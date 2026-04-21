package com.learning.solidanddesignpattern.designpatterns.bridge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BridgeExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Bridge Example ---");

        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();
        System.out.println("TV is on: " + tv.isEnabled());

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.mute();
        System.out.println("Radio is on: " + radio.isEnabled());
        System.out.println("Radio volume: " + radio.getVolume());


        System.out.println("--- End Bridge Example ---");
    }
}