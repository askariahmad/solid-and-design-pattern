package com.learning.solidanddesignpattern.designpatterns.chainofresponsibility;

public class ConcreteHandlerB implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        if (request.getType().equals("B")) {
            System.out.println("Handled by ConcreteHandlerB");
        } else if (next != null) {
            next.handle(request);
        }
    }
}