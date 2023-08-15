package com.lowleveldesigns.designpatterns.behavioral.observer.core;

import com.lowleveldesigns.designpatterns.behavioral.observer.core.Observer;

public class Trader implements Observer {

    @Override
    public void priceChange(int price) {
        System.out.println("The price has been changed to "+price);
    }
}
