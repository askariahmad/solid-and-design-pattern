package com.learning.solidanddesignpattern.solidprinciples.isp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IspExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- ISP Driver ---");

        Printer oldPrinter = new OldFashionedPrinter();
        oldPrinter.print();

        MultifunctionPrinter multiPrinter = new MultifunctionPrinter();
        multiPrinter.print();
        multiPrinter.scan();
        multiPrinter.fax();

        System.out.println("--- End ISP Driver ---");
    }
}