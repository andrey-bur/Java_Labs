package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("iPhone 13", 40);
        Smartphone smartphone2 = new Smartphone("Samsung Galaxy S24", 60);
        Smartphone smartphone3 = new Smartphone("Xiaomi 14", 25);
        Laptop laptop1 = new Laptop("MacBook Air", 50, 13.6);
        Laptop laptop2 = new Laptop("Lenovo IdeaPad", 30, 15.6);

        Switchable[] devices = {smartphone1, smartphone2, smartphone3, laptop1, laptop2};

        System.out.println("Включаем технику:");
        for (Switchable device : devices) {
            device.turnOn();
        }
        System.out.println("\nЗаряжаем технику:");

        Chargeable[] chargeableDevices = {smartphone1, smartphone2, smartphone3, laptop1, laptop2};

        for (Chargeable device : chargeableDevices) {
            device.charge();
        }
        System.out.println("\nУровень заряда:");
        for (Chargeable device : chargeableDevices) {
            System.out.println(device.getBatteryLevel() + "%");
        }
    }
}