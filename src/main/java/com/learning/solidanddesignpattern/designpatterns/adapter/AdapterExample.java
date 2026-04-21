package com.learning.solidanddesignpattern.designpatterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Adapter Example ---");

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        System.out.println("--- End Adapter Example ---");
    }
}