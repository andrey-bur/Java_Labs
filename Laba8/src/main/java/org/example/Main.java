package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Building[] buildings = {
                new Residential("ул. Ленина, 10", 5, 2500, 40),
                new Residential("ул. Пушкина, 25", 9, 5000, 80),
                new Residential("ул. Гагарина, 15", 12, 7500, 120),
                new Office("ул. Центральная, 5", 7, 4000, 15),
                new Office("ул. Советская, 30", 10, 6500, 25)
        };
        for (Building building : buildings) {
            building.displayInfo();
            if (building instanceof Residential) {
                System.out.println("Цена квартир: " + ((Residential) building).getApartmentPrice());
            }
            if (building instanceof Office) {
                System.out.println("Цена аренды: " + ((Office) building).getRentPrice());
            }
        }
    }
}