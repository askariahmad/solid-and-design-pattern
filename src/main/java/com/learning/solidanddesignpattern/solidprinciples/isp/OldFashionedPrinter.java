package com.learning.solidanddesignpattern.solidprinciples.isp;

public class OldFashionedPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}