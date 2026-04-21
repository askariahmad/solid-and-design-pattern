package com.learning.solidanddesignpattern.designpatterns.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height, String color) {
        g.setColor(Color.getColor(color));
        g.fillOval(x, y, width, height);
    }
}