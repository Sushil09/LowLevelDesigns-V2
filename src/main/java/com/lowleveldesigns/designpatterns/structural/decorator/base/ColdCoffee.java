package com.lowleveldesigns.designpatterns.structural.decorator.base;

public class ColdCoffee implements Coffee{
    private Coffee coffee;

    public ColdCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 40;
    }

    @Override
    public String description() {
        return coffee.description()+" with ice-creams";
    }

    @Override
    public String toString() {
        return String.valueOf(this.cost())+ " " +this.description();
    }
}
