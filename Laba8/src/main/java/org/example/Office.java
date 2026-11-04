package org.example;

public class Office extends Building {
    private int companies;

    public Office(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }

    public int getCompanies() {
        return companies;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }

    @Override
    public String getPurpose() {
        return "Офисное здание";
    }

    public double getRentPrice() {
        return getArea() * 15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество компаний: " + companies);
    }
}
