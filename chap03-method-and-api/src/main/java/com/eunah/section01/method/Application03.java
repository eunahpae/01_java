package main.java.com.eunah.section01.method;

public class Application03 {

    int test = 10; // 전역변수 , 클래스 안에 존재하는 전체에서 적용 가능

    public static void main(String[] args) {

        /*
         * 변수의 종류
         *
         * 1. 지역 변수
         * 2. 매개 변수
         * 3. 전역 변수 (필드)
         * 4. 클래스(static) 변수
         */

        int a = 10;
        int b = 20;    // 지역 변수


        Application03 app3 = new Application03();
        app3.testMethod(38);
        // app3.testMethod(38,40); 인자값의 개수가 안맞음
        // app3.testMethod("38"); 인자값의 자료형이 안맞음
        // app3.testMethod(); 인자값이 필요한데 입력되지 않음

        // 변수에 저장한 값 전달 테스트
        int age = 10;
        app3.testMethod(age);

        // 자동 형 변환을 이용한 값 전달 테스트
        byte byteAge = 20;
        app3.testMethod(byteAge);

        // 강제 형 변환을 이용한 값 전달 테스트
        long longAge = 30;
        // app3.testMethod(longAge); 인자값으로 전달될 int보다 long이 더 큰 자료형으로 강제 변환이 필요
        app3.testMethod((int) longAge);

        // 연산 결과를 이용한 값 전달 테스트
        app3.testMethod(byteAge * 5);

    }

    // 매개변수
    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age + "입니다.");

    }


}
