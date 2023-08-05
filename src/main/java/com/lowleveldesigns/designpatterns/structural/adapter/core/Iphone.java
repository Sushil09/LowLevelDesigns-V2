package com.lowleveldesigns.designpatterns.structural.adapter.core;

public class Iphone {
    private AppleCharger charger;

    public Iphone(AppleCharger charger) {
        this.charger = charger;
    }

    public void charge(){
        System.out.println("Your iphone is charging");
    }
}
