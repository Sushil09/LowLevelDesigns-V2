package com.lowleveldesigns.designpatterns.creational.builder;

import com.lowleveldesigns.designpatterns.creational.builder.core.Phone;

public class Client {
    public static void main(String[] args) {
        Phone firstPhone = new Phone.PhoneBuilder().
                setBattery(1500).
                setModel("Nokia Express3230").
                setImeiNumber("1234").build();
        System.out.println(firstPhone);
    }
}
