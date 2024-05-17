package main.java.com.eunah.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
         * 실습)
         * 두 수를 매개변수로 받아   1. 더한 값을 반환하는 메소드
         *                       2. 뺀 값을 반환하는 메소드
         *                       3. 곱한 값을 반환하는 메소드
         *                       4. 나눈 값을 반환하는 메소드
         *
         * 반환받아서 메인 메소드에 System.out.println 을 이용해 출력하기
         */


        Application07 app7 = new Application07();
        System.out.println(app7.adder(1, 2));
        System.out.println(app7.minus(3, 4));
        System.out.println(app7.multi(4, 2));
        System.out.println(app7.divide(6, 2));

        int result = app7.adder(5, 5);
        System.out.println(result);

    }

    public int adder(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }


}
