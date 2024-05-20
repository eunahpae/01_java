package main.java.com.eunah.section03.interfaceImplements;

public interface InterProduct {

    public static final int MAX_NUM = 100;

    // 인터페이스는 상수만 가질 수 있기 때문에 public static final 을 붙이지 않아도 붙인 것과 같다.
    int MIN_NUM = 10;

    // 인터페이스는 여러가지 메소드를 재정의하여 강제적으로 부여할 목적으로 사용한다.
    void abstractMethod();

    // static 은 몸체를 가져야 함
    static void staticMethod() {
        System.out.println("InterProuct 클래스의 static method 호출");
    }

    default void defaultMethod() {
        System.out.println("InterProuct 클래스의 default method 호출");
    }


}
