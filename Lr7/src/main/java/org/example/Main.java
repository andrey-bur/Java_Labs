package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Apartment[] apartments={
                new Apartment("Lenina",5,5.5),
                new Apartment("Valarand",9,99.09),
                new Apartment("Tish",67,911.54),
                new Apartment("Rust",1488,19)
        };
        for(Apartment apartment:apartments) {
            System.out.println(apartment);
        }
    }
}
