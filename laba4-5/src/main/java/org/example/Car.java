package org.example;

public class Car {
    String brand;
    String model;
    int year;
    int mileage;

    public Car(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;

    }

    public void drive(int km) {
        mileage += km;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Пробег: " + mileage + " км");
    }

    @Override
    public String  toString() {
        return brand + model + year + mileage;
    }

}
