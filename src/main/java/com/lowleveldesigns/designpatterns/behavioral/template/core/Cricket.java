package com.lowleveldesigns.designpatterns.behavioral.template.core;

public class Cricket extends Game{

    @Override
    public void startGame() {
        System.out.println("Cricket game started");
    }

    @Override
    public void resumeGame() {
        System.out.println("Cricket game resumed");
    }

    @Override
    public void endGame() {
        System.out.println("Cricket game ended");
    }
}
