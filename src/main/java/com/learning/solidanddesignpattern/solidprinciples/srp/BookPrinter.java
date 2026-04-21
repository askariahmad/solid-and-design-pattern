package com.learning.solidanddesignpattern.solidprinciples.srp;

import org.springframework.stereotype.Component;

@Component
public class BookPrinter {

    public void printBook(Book book) {
        System.out.println("Printing book...");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Text: " + book.getText());
    }
}