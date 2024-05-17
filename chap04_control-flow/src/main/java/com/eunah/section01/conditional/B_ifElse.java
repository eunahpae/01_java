package main.java.com.eunah.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElsaStatement() {

        /*
         * [if-else 조건식]
         * if(조건식){
         *   조건식이 true 일 때 실행할 명령문;
         * } else {
         *   조건식이 false 일 때 실행할 명령문;
         * }
         */

        /*
         * 정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."라고 출력하고
         * 홀수가 아니면 "입력하신 숫자는 짝수입닌다." 라고 출력하는 프로그램을 작성해보자.
         * 단, 조건과 상관없이 프로그램이 종료될 때, "프로그램 종료"라고 출력되도록 한다.
         */

        Scanner scr = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요 : ");
        int num = scr.nextInt();

        if (num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다. ");
        } else {
            System.out.println("짝수입니다.");
        }
        System.out.println("프로그램 종료");

    }

    public void testNestedIfElseStatement() {

        // if-Else 중첩

        /*
         * 숫자를 하나 입력 받아서 "입력하신 숫자는 양수입니다."
         * 음수이면 "입력하신 숫자는 음수입니다." 출력
         * 단, 0이면 "0입니다."를 출력한다.
         * 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료" 출력하도록 한다.
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = scr.nextInt();

        if (num != 0) {

            if (num > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }

        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        System.out.println("프로그램 종료");

    }
}
