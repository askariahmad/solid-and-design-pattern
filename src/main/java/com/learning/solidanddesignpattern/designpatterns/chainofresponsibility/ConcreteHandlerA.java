package com.learning.solidanddesignpattern.designpatterns.chainofresponsibility;

public class ConcreteHandlerA implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        if (request.getType().equals("A")) {
            System.out.println("Handled by ConcreteHandlerA");
        } else if (next != null) {
            next.handle(request);
        }
    }
}