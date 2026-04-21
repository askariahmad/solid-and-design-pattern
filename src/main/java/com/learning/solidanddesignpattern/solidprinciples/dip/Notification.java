package com.learning.solidanddesignpattern.solidprinciples.dip;

public class Notification {
    private Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void send() {
        message.sendMessage();
    }
}