package org.example;

public class Apartment {
    private String address;
    private int rooms;
    private double area;
    static int totalApartment;
    static double totalArea;

    public Apartment(String address, int rooms, double area) {
        this.address = address;
        this.rooms = rooms;
        this.area = area;

        totalApartment++;
        totalArea += area;
    }

    static double getAveageArea() {
        return totalApartment == 0 ? 0 : totalArea / totalApartment;
    }

    @Override
    public String toString() {
        return String.format("""
                Address: %s,
                Room: %d,
                Area: %.2f,
                TotalArea: %.2f.
                """, address, rooms, area, getAveageArea());
    }
}
