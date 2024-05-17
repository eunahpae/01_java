package main.java.com.eunah.section02.package_and_import;

import main.java.com.eunah.section01.method.Calculator;

import static main.java.com.eunah.section01.method.Calculator.maxNumber;

public class Application02 {
    public static void main(String[] args) {

        /*
        * import 란?
        * 서로 다른 패키지에서 존재하는 클래스를 사용하는 경우에는 패키지 명을 포함한 풀 클래스이름을 사용해야 한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        */

        Calculator calc = new Calculator();

        int min = calc.minNumber(3,5);
        System.out.println(min);

        int max = Calculator.maxNumber(3,5);
        System.out.println(max);

        // method import
        int max2 = maxNumber(3,5);
        System.out.println(max2);
        
    }
}
