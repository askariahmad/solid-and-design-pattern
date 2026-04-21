package com.learning.solidanddesignpattern.designpatterns.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Composite Example ---");

        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        root.add(home);
        home.add(user);
        user.add(file1);
        user.add(file2);

        root.ls();

        System.out.println("--- End Composite Example ---");
    }
}