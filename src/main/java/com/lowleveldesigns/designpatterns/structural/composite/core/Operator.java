package com.lowleveldesigns.designpatterns.structural.composite.core;

public class Operator implements LeafNode {

    private LeafNode leftSide;
    private LeafNode rightSide;
    private Operands operands;

    public Operator(LeafNode leftSide, LeafNode rightSide, Operands operands) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.operands = operands;
    }

    @Override
    public int eval() {
        int value = 0;
        switch (this.operands) {
            case ADD -> {
                value = this.leftSide.eval() + this.rightSide.eval();
            }
            case SUBSTRACT -> {
                value = this.leftSide.eval() - this.rightSide.eval();
            }
            case MULTIPLY -> {
                value = this.leftSide.eval() * this.rightSide.eval();
            }
            case DIVIDE -> {
                value = this.leftSide.eval() / this.rightSide.eval();
            }
        }
        return value;
    }
}
