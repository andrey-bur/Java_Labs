package org.example;

public class Building {
    private String address;
    private int floors;
    private double area;

    public double getArea() {
        return area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }

    public Building(String address, int floors, double area) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    public String getPurpose() {
        return "Задание";
    }

    public void displayInfo() {
        System.out.println("Адрес: " + address);
        System.out.println("Этажей: " + floors);
        System.out.println("Площадь: " + area + " м²");
        System.out.println("Назначение: " + getPurpose());
    }

}
