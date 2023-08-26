package com.lowleveldesigns.designpatterns.behavioral.strategy.core;

public class NormalDriveStrategy implements VehicleStrategy {

    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}
