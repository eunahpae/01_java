package main.java.com.eunah.section01.understand;

import main.java.com.eunah.section01.understand.car.Car;
import main.java.com.eunah.section01.understand.car.ElectricCar;
import main.java.com.eunah.section01.understand.car.OldCar;
import main.java.com.eunah.section01.understand.seller.Seller;

public class Application { // 프로그램 실행부
    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램입니다.");
        // 전기차 객체 생성
        ElectricCar ionic1 = new ElectricCar("H",1000,"ionic1","1000km");
        ElectricCar ionic2 = new ElectricCar("H",1500,"ionic2","1500km");
        ElectricCar ionic3 = new ElectricCar("H",2000,"ionic3","2000km");

        // 내연기관 자동차 객체 생성
        OldCar porter = new OldCar("H",1500,"Porter","diesel");
        OldCar avante = new OldCar("H",1500,"avante","gasoline");
        OldCar sonata = new OldCar("H",1200,"sonata","diesel");

        // 영업사원 홍길동 입사
        Seller seller = new Seller("홍길동");
        System.out.println("홍길동 사원 실적");

        Car[] cars = {porter,ionic2,sonata,avante,ionic3};

        seller.sale(cars);
        System.out.println("결산 : "+seller.toString());


    }
}
