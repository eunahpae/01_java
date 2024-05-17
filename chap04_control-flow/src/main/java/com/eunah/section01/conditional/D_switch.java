package main.java.com.eunah.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {

        /*
         * [switch문 표현식]
         *
         * switch(비교할 변수) {
         *       case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
         *       case 비교값2 : 비교값2과 일치하는 경우 실행할 구문; break;
         *       case 비교값3 : 비교값3과 일치하는 경우 실행할 구문; break;
         *       default : case  모두에 해당하지 않는 경우 실행할 구문ㅣ break;
         * }
         *
         * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if 와 유사하다.
         * 따라서 일부 호환이 가능하다.
         * 하지만, switch 문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
         * 실수와 논리는 비교할 수 없다.
         * 또한 정확하게 일치하는 경우에만 비교할 수 있으며, 대소비교를 할 수 없다.
         * case 절에는 변수를 사용하지 못한다.
         */


        // 정수 2개와 연산 기호를 입력 받아서
        // 두 숫자와 연산 결과를 출력해보는 간단한 계산기

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);


    }

    public void testSwitchVandingMachine() {

        System.out.println("==========자판기==========");
        System.out.println("사이다(1000)     콜라(1500)     환타(1200)     박카스(1000)     핫식스(2000)");
        System.out.println("음료 이름을 입력해주세요 :");


        Scanner sc = new Scanner(System.in);
        String selectDrink = sc.nextLine();

        int price = 0;

        switch (selectDrink) {

            case "사이다":
                price = 1000;
                break;
            case "콜라":
                price = 1500;
                break;
            case "환타":
                price = 1200;
                break;
            case "박카스":
                price = 1000;
                break;
            case "핫식스":
                price = 2000;
                break;
            default:
                System.out.println("그런 음료수는 없습니다");
                break;
        }

        System.out.println(selectDrink + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요.");

    }


}
