package com.lowleveldesigns.designpatterns.structural.composite.core;

public class Number implements LeafNode{

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int eval() {
        return this.number;
    }
}
