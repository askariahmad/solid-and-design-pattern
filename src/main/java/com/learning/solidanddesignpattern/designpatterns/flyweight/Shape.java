package com.learning.solidanddesignpattern.designpatterns.flyweight;

import java.awt.Graphics;

public interface Shape {
    void draw(Graphics g, int x, int y, int width, int height, String color);
}