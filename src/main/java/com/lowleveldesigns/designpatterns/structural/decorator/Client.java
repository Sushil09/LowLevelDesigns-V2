package com.lowleveldesigns.designpatterns.structural.decorator;

import com.lowleveldesigns.designpatterns.structural.decorator.base.Coffee;
import com.lowleveldesigns.designpatterns.structural.decorator.base.ColdCoffee;
import com.lowleveldesigns.designpatterns.structural.decorator.base.SimpleCoffee;
import com.lowleveldesigns.designpatterns.structural.decorator.base.SugarCoffee;

public class Client {
    public static void main(String[] args) {
        Coffee planeCoffee = new SimpleCoffee();
        Coffee coldCoffee = new ColdCoffee(planeCoffee);
        Coffee ColdCoffeeWithSugar = new ColdCoffee(new SugarCoffee(planeCoffee));

        System.out.println(planeCoffee);
        System.out.println(coldCoffee);
        System.out.println(ColdCoffeeWithSugar);
    }
}
