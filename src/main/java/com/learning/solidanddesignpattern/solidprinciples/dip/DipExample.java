package com.learning.solidanddesignpattern.solidprinciples.dip;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DipExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- DIP Driver ---");

        Message email = new Email();
        Notification emailNotification = new Notification(email);
        emailNotification.send();

        Message sms = new Sms();
        Notification smsNotification = new Notification(sms);
        smsNotification.send();

        System.out.println("--- End DIP Driver ---");
    }
}