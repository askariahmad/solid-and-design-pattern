package com.learning.solidanddesignpattern.designpatterns.creational.factorymethod;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}