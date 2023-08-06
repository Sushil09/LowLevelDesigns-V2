package com.lowleveldesigns.designpatterns.structural.decorator.base;

public class SugarCoffee implements Coffee{
    private Coffee coffee;

    public SugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost()+10;
    }

    @Override
    public String description() {
        return coffee.description()+" with sugar";
    }

    @Override
    public String toString() {
        return String.valueOf(this.cost())+ " "+this.description();
    }
}
