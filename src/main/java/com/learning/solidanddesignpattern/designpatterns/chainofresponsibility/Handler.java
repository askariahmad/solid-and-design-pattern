package com.learning.solidanddesignpattern.designpatterns.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(Request request);
}