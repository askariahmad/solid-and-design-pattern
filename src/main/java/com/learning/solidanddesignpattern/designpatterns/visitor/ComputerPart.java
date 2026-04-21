package com.learning.solidanddesignpattern.designpatterns.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}