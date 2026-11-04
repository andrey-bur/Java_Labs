package org.example;

public class Smartphone extends Device {
    private int cameraMP;

    public int getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }
    public Smartphone(String model, float power,boolean isOn,int cameraMP){
        super(model,power,isOn);
        this.cameraMP=cameraMP;
    }
    public void turnOn(){
        System.out.println("\nСмартфон загружается\n");
    }

    public void turnOff(){
        System.out.println("\nСмартфон выключается\n");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("МП: %d",cameraMP);
    }
}
