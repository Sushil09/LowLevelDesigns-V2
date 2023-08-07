package com.lowleveldesigns.designpatterns.structural.composite;

import com.lowleveldesigns.designpatterns.structural.composite.core.LeafNode;
import com.lowleveldesigns.designpatterns.structural.composite.core.Number;
import com.lowleveldesigns.designpatterns.structural.composite.core.Operands;
import com.lowleveldesigns.designpatterns.structural.composite.core.Operator;

/*
* This pattern is like a tree data-structure. with left and right child's and root at the middle
*
* */
public class Client {
    public static void main(String[] args) {
        LeafNode leafNode2 = new Number(2);
        LeafNode leafNode1 = new Number(1);
        LeafNode leafNode3 = new Number(3);

        LeafNode operator1 = new Operator(leafNode2,leafNode1, Operands.ADD);
        LeafNode operator2 = new Operator(leafNode3,operator1, Operands.MULTIPLY);

        System.out.println(operator2.eval());
    }
}
