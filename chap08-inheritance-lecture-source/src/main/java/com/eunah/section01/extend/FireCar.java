package main.java.com.eunah.section01.extend;

public class FireCar extends Car {
    public FireCar() {
        super();
    }

    @Override
    public void soundHorn() {
        super.soundHorn();
        if (isRunning()){
            System.out.println("삐잉 삐이이이이이이이잉~~~~~~");
        }else {
            System.out.println("소방차가 주행중이 아닙니다.");
        }
    }


    public void sprayWater() {
        System.out.println("불난곳에 물을 뿌려줍니다. ");
    }


}
