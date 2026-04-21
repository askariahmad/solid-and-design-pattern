package com.learning.solidanddesignpattern.solidprinciples.srp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SrpExample implements CommandLineRunner {

    private final BookService bookService;

    public SrpExample(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- SRP Driver ---");
        bookService.processBook();
        System.out.println("--- End SRP Driver ---");
    }
}