package com.lowleveldesigns.designpatterns.behavioral.observer.core;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> traders = new ArrayList<>();
    private int price;

    public void setPrice(int price) {
        this.price = price;
        notifyTraders();
    }

    @Override
    public void addObserver(Observer observer) {
        traders.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        traders.remove(observer);
    }

    @Override
    public void notifyTraders() {
        for (Observer trader : traders) {
            trader.priceChange(price);
        }
    }
}
