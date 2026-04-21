package com.learning.solidanddesignpattern.solidprinciples.dip;

public class Email implements Message {
    public void sendMessage() {
        System.out.println("Sending email...");
    }
}