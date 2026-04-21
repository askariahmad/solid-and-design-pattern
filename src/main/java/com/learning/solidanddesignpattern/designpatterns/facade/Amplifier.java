package com.learning.solidanddesignpattern.designpatterns.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier setting DVD player to " + dvd);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }
}