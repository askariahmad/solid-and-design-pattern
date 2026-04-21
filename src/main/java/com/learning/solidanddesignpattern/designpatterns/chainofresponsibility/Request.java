package com.learning.solidanddesignpattern.designpatterns.chainofresponsibility;

public class Request {
    private String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}