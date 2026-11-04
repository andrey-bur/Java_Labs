package org.example;

abstract class Device {
    private String model;
    private float power;
    private boolean isOn;

    public float getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Device(String model, float power,boolean isOn) {
        this.model = model;
        this.power = power;
        this.isOn=isOn;
    }

    abstract public void turnOn();

    abstract public void turnOff();

    public void displayInfo() {
        System.out.printf("""
                Модель: %s,
                Мощность: %f,
                Включен: %s.
                """, model, power, isOn ? "да" : "нет");
    }
}
