package com.lowleveldesigns.designpatterns.behavioral.template.core;

public abstract class Game {
    public abstract void startGame();
    public abstract void resumeGame();
    public abstract void endGame();

    public final void play(){
        startGame();

        resumeGame();

        endGame();
    }
}
