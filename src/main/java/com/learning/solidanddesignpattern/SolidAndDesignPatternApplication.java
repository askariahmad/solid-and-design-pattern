package com.learning.solidanddesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.solidanddesignpattern.solid.interfacesegregation.goodway",
        "com.learning.solidanddesignpattern.solid.dependencyinversion.goodway",
        "com.learning.solidanddesignpattern.designpatterns.adapter",
        "com.learning.solidanddesignpattern.designpatterns.bridge",
        "com.learning.solidanddesignpattern.designpatterns.composite",
        "com.learning.solidanddesignpattern.designpatterns.decorator",
        "com.learning.solidanddesignpattern.designpatterns.facade",
        "com.learning.solidanddesignpattern.designpatterns.flyweight",
        "com.learning.solidanddesignpattern.designpatterns.proxy",
        "com.learning.solidanddesignpattern.designpatterns.chainofresponsibility",
        "com.learning.solidanddesignpattern.designpatterns.command",
        "com.learning.solidanddesignpattern.designpatterns.interpreter",
        "com.learning.solidanddesignpattern.designpatterns.iterator",
        "com.learning.solidanddesignpattern.designpatterns.mediator",
        "com.learning.solidanddesignpattern.designpatterns.memento",
        "com.learning.solidanddesignpattern.designpatterns.observer",
        "com.learning.solidanddesignpattern.designpatterns.state",
        "com.learning.solidanddesignpattern.designpatterns.strategy",
        "com.learning.solidanddesignpattern.designpatterns.templatemethod",
        "com.learning.solidanddesignpattern.designpatterns.visitor"})
public class SolidAndDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidAndDesignPatternApplication.class, args);
    }

}