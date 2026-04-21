package com.learning.solidanddesignpattern.designpatterns.facade;

public class Tuner {
    public void on() {
        System.out.println("Tuner on");
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setAm() {
        System.out.println("Tuner setting AM mode");
    }

    public void setFm() {
        System.out.println("Tuner setting FM mode");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner setting frequency to " + frequency);
    }
}