package main.java.com.eunah.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileStatement(){

        /*
         * [do-while 문 표현식]
         *
         * 초기식;
         * do {
         *      1회차에는 무조건 실행, 이후에는 조건식을 확인하여 만족하는 경우에만 실행할 구문;
         *      증감식;
         * } whilel(조건식);
         */

        do {
            System.out.println("최초 한 번 동작");
        } while (false);
        System.out.println("반복문 종효");

    }

    public void testDoWhile(){

        // 문자열을 입력 받아 반복적으로 출력
        // 단, exit 가 입력되면 반복문을 종료한다.

        Scanner sc = new Scanner(System.in);

        String str = "";

        do {
            System.out.println("문자를 입력하세요. :");
            str = sc.nextLine();
            System.out.println(str);
        } while (!str.equals("exit"));

        System.out.println("프로그램 종료");

    }

}
