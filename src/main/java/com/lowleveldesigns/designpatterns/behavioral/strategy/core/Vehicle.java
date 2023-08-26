package com.lowleveldesigns.designpatterns.behavioral.strategy.core;

public class Vehicle {
    private VehicleStrategy vehicleStrategy;

    public Vehicle(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;
    }
    
    public void drive(){
        vehicleStrategy.drive();
    }
}
