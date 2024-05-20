package main.java.com.eunah.section04.use1;

public class FireCar extends Car implements Soundable{

    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 비키세요.");
    }
}
