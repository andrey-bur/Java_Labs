package org.example;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private double price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) throws InvalidCarDataException {
        if (brand == null || brand.isBlank()) {
            throw new InvalidCarDataException("Марка автомобиля не может быть пустой");
        }
        this.brand=brand;
    }

    public void setModel(String model) throws InvalidCarDataException{
        if (model == null || model.isBlank()) {
            throw new InvalidCarDataException("Модель автомобиля не может быть пустой");
        }
        this.model=model;
    }

    public void setYear(int year) throws InvalidCarDataException {
        if (year < 1900 || year > 2025) {
            throw new InvalidCarDataException("Год выпуска должен быть от 1900 до 2025");
        }
        this.year=year;
    }

    public void setMileage(int mileage) throws InvalidCarDataException {
        if (mileage < 0) {
            throw new InvalidCarDataException("Пробег не может быть отрицательным");
        }
        this.mileage = mileage;
    }

    public void setPrice(double price) throws InvalidCarDataException{
        if (!Double.isFinite(price) || price <= 0) {
            throw new InvalidCarDataException("Цена должна быть конечным числом больше нуля");
        }
        this.price = price;
    }

    public Car(String brand, String model, int year, int mileage, double price) throws InvalidCarDataException {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setPrice(price);
    }
    public void updatePrice(double newPrice) throws PriceUpdateException,InvalidCarDataException {
        if (!Double.isFinite(newPrice) || newPrice <= 0) {
            throw new PriceUpdateException("Новая цена должна быть конечным числом больше нуля");
        }
        setPrice(newPrice);
        System.out.printf("Цена автомобиля %s %s изменена на %.2f руб.%n", getBrand(), getModel(), getPrice());
    }
    public void addMileage(int km) throws InvalidCarDataException {
        if (km < 0) {
           throw new InvalidCarDataException("Количество километров не может быть отрицательным");
        }
        if (km > Integer.MAX_VALUE - mileage) {
            throw new InvalidCarDataException("Превышено максимально допустимое значение пробега");
        }
        setMileage(getMileage()+ km);
        System.out.printf("Пробег автомобиля %s %s увеличен. Новый пробег: %d км%n", getBrand(), getModel(), getMileage());
    }

    public void displayInfo() {
        System.out.printf("""
            Марка: %s
            Модель: %s
            Год: %d
            Пробег: %d км
            Цена: %.2f руб.
            %n""", getBrand(), getModel(), getYear(), getMileage(), getPrice());
    }

    public static void buyCar(List<Car> cars, String brand, String model) throws CarNotFoundException {
        Car carToBuy = null;
        for (Car car : cars) {
            if (car.getBrand().equals(brand) && car.getModel().equals(model)) {
                carToBuy = car;
                break;
            }
        }
        if (carToBuy == null) {
            throw new CarNotFoundException("Автомобиль " + brand + " " + model + " не найден в автосалоне");
        }
        cars.remove(carToBuy);
        System.out.printf("Автомобиль %s %s куплен за %.2f руб.%n",
                carToBuy.getBrand(),
                carToBuy.getModel(),
                carToBuy.getPrice()
        );
    }
}
