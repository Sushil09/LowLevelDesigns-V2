package com.lowleveldesigns.designpatterns.structural.adapter.core;

public class AndroidPhone {
    private AndroidCharger androidCharger;

    public AndroidPhone(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    public void charge(){
        System.out.println("Your Android phone is charging");
    }
}
