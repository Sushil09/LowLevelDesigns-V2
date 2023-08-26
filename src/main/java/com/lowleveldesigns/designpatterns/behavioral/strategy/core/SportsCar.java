package com.lowleveldesigns.designpatterns.behavioral.strategy.core;

public class SportsCar extends Vehicle{

    public SportsCar() {
        super(new SportsDriveStrategy());
    }
    
}
