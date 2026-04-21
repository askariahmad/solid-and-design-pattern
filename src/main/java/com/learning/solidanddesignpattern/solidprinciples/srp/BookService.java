package com.learning.solidanddesignpattern.solidprinciples.srp;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookPrinter bookPrinter;

    public BookService(BookPrinter bookPrinter) {
        this.bookPrinter = bookPrinter;
    }

    public void processBook() {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", "...");
        bookPrinter.printBook(book);
    }
}