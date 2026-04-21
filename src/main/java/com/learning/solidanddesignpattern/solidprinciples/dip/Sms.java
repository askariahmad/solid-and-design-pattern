package com.learning.solidanddesignpattern.solidprinciples.dip;

public class Sms implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS...");
    }
}