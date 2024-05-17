package main.java.com.eunah.section01.extend;

public class Car { // Car 라는 상위클래스(부모)

    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스 기본생성자 호출");
    }

    public void run(){ // 달리는 기능
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public boolean isRunning(){ // 주행상태 반환 기능
        return runningStatus;
    }


    public void soundHorn(){ // 주행 중일 때 경적울리는 기능
        if (isRunning()){
            System.out.println("빵빵~~~");
        }else {
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }



}
