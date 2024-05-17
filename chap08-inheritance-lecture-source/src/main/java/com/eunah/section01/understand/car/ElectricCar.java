package main.java.com.eunah.section01.understand.car;

public class ElectricCar extends Car {

    private String energy;

    public ElectricCar(String brand, int price, String name, String energy) {
        super(brand, price, name);
        this.energy = energy;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public double getPrice() {
        System.out.println("전기차의 판매가는 " + super.getPrice() + "원 입니다.");
        return super.getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName" + super.getName() +
                "energy='" + energy + '\'' +
                '}';
    }
}

