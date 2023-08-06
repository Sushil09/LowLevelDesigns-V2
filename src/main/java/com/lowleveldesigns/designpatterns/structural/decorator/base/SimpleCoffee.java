package com.lowleveldesigns.designpatterns.structural.decorator.base;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 30;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }

    @Override
    public String toString() {
        return String.valueOf(this.cost())+ " "+this.description();
    }
}
