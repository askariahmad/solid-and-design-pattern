package com.learning.solidanddesignpattern.designpatterns.factorymethod;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}