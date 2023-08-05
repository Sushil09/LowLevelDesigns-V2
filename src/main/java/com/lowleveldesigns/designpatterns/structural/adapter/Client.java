package com.lowleveldesigns.designpatterns.structural.adapter;

import com.lowleveldesigns.designpatterns.structural.adapter.core.*;

public class Client {
    public static void main(String[] args) {

        //Iphone using Android charger
        AppleCharger appleCharger = new ChargerAdapter(new AndroidCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.charge();

        //Android phone with android charger
        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new AndroidPhone(androidCharger);
        androidPhone.charge();

    }
}
