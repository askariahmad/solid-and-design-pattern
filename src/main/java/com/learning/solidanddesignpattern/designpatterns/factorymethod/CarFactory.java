package com.learning.solidanddesignpattern.designpatterns.factorymethod;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}