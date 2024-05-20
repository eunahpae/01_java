package main.java.com.eunah.section02;

public class SmartPhone extends Product{

    public SmartPhone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("product 클래스의 추상 메소드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 의 print 메소드를 호출함.");
    }

}
