package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Device[] devices={
                new Laptop("dfsfs",6,true,58),
                new Laptop("sdgsfgs",43,false,234),
                new Smartphone("fdsgsdf",33,false,32),
                new Smartphone("alsda",23,true,21),
                new Smartphone("odsen",23,true,23)
        };
        for(Device device:devices){
            device.turnOn();
            device.displayInfo();
            device.turnOff();
        }
    }
}
