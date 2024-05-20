package main.java.com.eunah.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 사냥을 위해 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다.");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다.");
    }

}
