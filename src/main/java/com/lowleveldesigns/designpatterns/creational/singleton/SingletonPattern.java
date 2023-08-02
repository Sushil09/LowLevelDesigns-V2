package com.lowleveldesigns.designpatterns.creational.singleton;

/*
 * All implementations of the Singleton have these two steps in common:
 * 1) Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
 * 2) Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field.
 * All following calls to this method return the cached object.
 * More info:
 *  Use the Singleton pattern when you need stricter control over global variables.
 */

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonObjectCreator singletonObject1 = SingletonObjectCreator.getSingletonObject();
        singletonObject1.testMethod();

        SingletonObjectCreator singletonObject2 = SingletonObjectCreator.getSingletonObject();

        if (singletonObject1 == singletonObject2) {
            System.out.println("Both objects are equal and has hashCode values as singletonObject1= " + singletonObject1.hashCode() + " and singletonObject2= " + singletonObject1.hashCode());
        }
    }
}
