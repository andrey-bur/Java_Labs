package org.example;

class Laptop implements Switchable, Chargeable {
    String model;
    int battery;
    boolean on;
    double screenSize;

    Laptop(String model, int battery, double screenSize) {
        this.model = model;
        this.battery = battery;
        this.screenSize = screenSize;
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println(model + " включен");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println(model + " выключен");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void charge() {
        battery = 100;
        System.out.println(model + " заряжен до 100%");
    }

    @Override
    public int getBatteryLevel() {
        return battery;
    }
}