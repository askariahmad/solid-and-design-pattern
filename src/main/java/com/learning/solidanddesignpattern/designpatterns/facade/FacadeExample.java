package com.learning.solidanddesignpattern.designpatterns.facade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FacadeExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Facade Example ---");

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, screen);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();

        System.out.println("--- End Facade Example ---");
    }
}