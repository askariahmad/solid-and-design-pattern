package com.learning.solidanddesignpattern.designpatterns.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String os;
}