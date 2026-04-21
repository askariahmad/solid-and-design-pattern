package com.learning.solidanddesignpattern.designpatterns.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BuilderExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Builder Example ---");

        Computer gamingComputer = Computer.builder()
                .cpu("Intel i9")
                .ram("32GB")
                .storage("1TB SSD")
                .gpu("NVIDIA RTX 3080")
                .os("Windows")
                .build();

        Computer officeComputer = Computer.builder()
                .cpu("Intel i5")
                .ram("16GB")
                .storage("512GB SSD")
                .os("Windows")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);

        System.out.println("--- End Builder Example ---");
    }
}