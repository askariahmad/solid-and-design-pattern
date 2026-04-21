package com.learning.solidanddesignpattern.designpatterns.iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IteratorExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Iterator Example ---");

        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        System.out.println("--- End Iterator Example ---");
    }
}