package main.java.com.eunah.section03.abstraction;

public class CarRacer {

    private Car car = new Car();


    /**
     * this.car의 시돟을 거는 메소드
     */
    public void startUp() {
        car.startUp();
    }

    /**
     * this.car를 앞으로 가게 하는 메소드
     */
    public void stepAccelator() {
        car.go();
    }

    /**
     * this.car를 멈추는 메소드
     */
    public void stepBreak() {
        car.stop();
    }

    /**
     * this.car의 시동을 끄는 메소드
     */
    public void turnOff() {
        car.turnOff();
    }

}
