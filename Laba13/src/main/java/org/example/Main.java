package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<Car> cars = new ArrayList<>();
        try {
            cars.add(new Car("BMW", "X5", 2023, 25000, 5500000));
            cars.add(new Car("Toyota", "Camry", 2022, 30000, 3200000));
            cars.add(new Car("Mercedes", "E200", 2021, 40000, 4100000));
            System.out.println("Автомобили добавлены в автосалон.");
        } catch (InvalidCarDataException e) {
            System.out.println("Ошибка создания автомобиля: " + e.getMessage());
        }
        System.out.println("\nСписок автомобилей:");
        for (Car car : cars) {
            car.displayInfo();
        }
        System.out.println("\nИзменение цены:");
        try {
            cars.get(1).updatePrice(5300000);
        } catch (PriceUpdateException | InvalidCarDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("\nУвеличение пробега:");
        try {
            cars.get(0).addMileage(5000);

        } catch (InvalidCarDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("\nПроверка некорректной цены:");
        try {
            cars.get(0).updatePrice(-1000);
        } catch (PriceUpdateException | InvalidCarDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("\nПокупка автомобиля:");
        try {
            Car.buyCar(cars, "BMW", "X5");
        } catch (CarNotFoundException e) {
            System.out.println("Ошибка покупки: " + e.getMessage());
        }
        System.out.println("\nПокупка отсутствующего автомобиля:");
        try {
            Car.buyCar(cars, "Audi", "A8");
        } catch (CarNotFoundException e) {
            System.out.println("Ошибка покупки: " + e.getMessage());
        }
        System.out.println("\nИтоговый список автомобилей:");
        for (Car car : cars) {
            car.displayInfo();
        }
    }
}
