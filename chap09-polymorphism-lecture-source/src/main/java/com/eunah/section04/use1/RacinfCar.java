package main.java.com.eunah.section04.use1;

public class RacinfCar extends Car{

    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
