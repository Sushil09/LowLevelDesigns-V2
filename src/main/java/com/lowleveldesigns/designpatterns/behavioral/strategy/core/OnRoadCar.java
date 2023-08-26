package com.lowleveldesigns.designpatterns.behavioral.strategy.core;

public class OnRoadCar extends Vehicle {

    public OnRoadCar() {
        super(new NormalDriveStrategy());
    }
    
}
