package main.java.com.eunah.section01.understand.car;

public class Car {

    private final String brand;
    private int price;
    private String name;

    public Car(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
