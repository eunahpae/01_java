package main.java.com.eunah.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /*
        * static 이란?
        * Static은 '정적인, 고정된'이라는 뜻을 가지고 있다.
        * 이러한 이름을 가지는 이유는 바로 static이 앞에 붙는 변수나 메서드는 어떤 객체에 소속되는 것이 아닌, 클래스에 고정되어 있는 변수나 메서드이기 때문이다.
        *
        * 특징)
        * 1. 메모리에 고정적으로 할당되어 있다.
        *   1-1. 그래서 객체 생성 없이 사용할 수 있다.
        *   1-2. Static 이 아닌 Non-method 인 경우, 호출되기 전까지 메모리에 올라가 있지 않기 때문에, 객체를 생성(new)하여 사용해야 한다.
        * 2. 프로그램이 시작되면 메모리의 static 영역에 적재되고, 프로그램이 종료될 때 해제된다.
        * 3. Static 메소드 내에서는 인스턴스 변수를 사용할 수 없다.
        */


        /* static 메소드 호출
         * 호출 방법 - 클래스명.메소드명();
         */


        System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10, 20));
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30));

    }


    public static int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
