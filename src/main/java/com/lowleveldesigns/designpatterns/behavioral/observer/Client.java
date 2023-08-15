package com.lowleveldesigns.designpatterns.behavioral.observer;

import com.lowleveldesigns.designpatterns.behavioral.observer.core.Observer;
import com.lowleveldesigns.designpatterns.behavioral.observer.core.Stock;
import com.lowleveldesigns.designpatterns.behavioral.observer.core.Trader;

public class Client {
    public static void main(String[] args) {
        Observer trader1 = new Trader();
        Observer trader2 = new Trader();
        Stock stock = new Stock();
        stock.addObserver(trader1);
        stock.addObserver(trader2);
        stock.setPrice(330);
        System.out.println("After trader has removed the notification");
        stock.removeObserver(trader2);
        stock.setPrice(220);

    }
}
