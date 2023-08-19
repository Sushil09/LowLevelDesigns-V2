package com.lowleveldesigns.designpatterns.behavioral.template.core;

public class Football extends Game{
    @Override
    public void startGame() {
        System.out.println("Football Game started");
    }

    @Override
    public void resumeGame() {
        System.out.println("Football Game resumed");
    }

    @Override
    public void endGame() {
        System.out.println("Football Game ended");
    }
}
