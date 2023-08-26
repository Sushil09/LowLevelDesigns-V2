package com.lowleveldesigns.designpatterns.behavioral.strategy;

import com.lowleveldesigns.designpatterns.behavioral.strategy.core.OnRoadCar;
import com.lowleveldesigns.designpatterns.behavioral.strategy.core.SportsCar;
import com.lowleveldesigns.designpatterns.behavioral.strategy.core.SportsDriveStrategy;
import com.lowleveldesigns.designpatterns.behavioral.strategy.core.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle sportsCar = new SportsCar();
        Vehicle onRoadCar = new OnRoadCar();

        sportsCar.drive(); // re-using the functinality of Sports Drive strategy
        onRoadCar.drive(); // re-using the functinality of Normal Drive strategy
    }
}
