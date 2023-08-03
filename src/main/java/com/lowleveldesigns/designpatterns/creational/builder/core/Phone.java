package com.lowleveldesigns.designpatterns.creational.builder.core;

public class Phone {
    private String imeiNumber;
    private String model;
    private int battery;
    private int ram;
    private int spaceInGbs;

    public Phone(PhoneBuilder phoneBuilder) {
        this.imeiNumber = phoneBuilder.imeiNumber;
        this.model = phoneBuilder.model;
        this.battery = phoneBuilder.battery;
        this.ram = phoneBuilder.ram;
        this.spaceInGbs = phoneBuilder.spaceInGbs;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public int getSpaceInGbs() {
        return spaceInGbs;
    }

    //Builder class to set the values of values
     public static class PhoneBuilder{
        private String imeiNumber;
        private String model;
        private int battery;
        private int ram;
        private int spaceInGbs;


        public PhoneBuilder setImeiNumber(String imeiNumber) {
            this.imeiNumber = imeiNumber;
            return this;
        }

        public PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setSpaceInGbs(int spaceInGbs) {
            this.spaceInGbs = spaceInGbs;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imeiNumber='" + imeiNumber + '\'' +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                ", ram=" + ram +
                ", spaceInGbs=" + spaceInGbs +
                '}';
    }
}
