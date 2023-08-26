package com.lowleveldesigns.designpatterns.behavioral.strategy.core;

public class SportsDriveStrategy implements VehicleStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Stategy");
    }
    
}
