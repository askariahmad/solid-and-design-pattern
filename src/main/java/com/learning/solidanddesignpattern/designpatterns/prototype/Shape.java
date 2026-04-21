package com.learning.solidanddesignpattern.designpatterns.prototype;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}