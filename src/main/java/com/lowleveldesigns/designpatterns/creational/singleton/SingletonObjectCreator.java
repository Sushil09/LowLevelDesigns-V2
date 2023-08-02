package com.lowleveldesigns.designpatterns.creational.singleton;

import java.util.Objects;

public final class SingletonObjectCreator {
    private static SingletonObjectCreator singletonObject;

    private SingletonObjectCreator() {
    }

    public static SingletonObjectCreator getSingletonObject() {
        if (Objects.isNull(singletonObject)) {
            synchronized(SingletonObjectCreator.class) {
                singletonObject = new SingletonObjectCreator();
            }
        }
        return singletonObject;
    }

    public void testMethod() {
        System.out.println("Called from singleTon method");
    }
}
