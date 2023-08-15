package com.lowleveldesigns.designpatterns.behavioral.observer.core;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyTraders();
}
