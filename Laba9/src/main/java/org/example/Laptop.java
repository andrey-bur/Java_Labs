package org.example;

public class Laptop extends Device{

    private int screenSize;

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public Laptop(String model, float power, boolean isOn, int screenSize){
        super(model,power,isOn);
        this.screenSize=screenSize;
    }
    public void turnOn(){
        System.out.println("\nНоутбук загружает ОС\n");
    }

    public void turnOff(){
        System.out.println("\nНоутбук завершает работу\n");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Размер экрана: %d",screenSize);
    }
}
