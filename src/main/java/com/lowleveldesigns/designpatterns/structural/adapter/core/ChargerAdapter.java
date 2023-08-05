package com.lowleveldesigns.designpatterns.structural.adapter.core;

public class ChargerAdapter implements AppleCharger{

    private AndroidCharger androidCharger;

    public ChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void charge() {
        androidCharger.charge();
    }
}
