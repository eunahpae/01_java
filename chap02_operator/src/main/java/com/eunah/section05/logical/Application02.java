package main.java.com.eunah.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 논리 연산자의 우선순위
         * && : 11순위
         * || : 12순위
         */

        int num = 55;
        /* 1 < num1 < 100 이렇게 쓸 수 없음 */
        System.out.println("num이 1부터 100 사이에 있는지 확인 : " + (num >= 1 && num <= 100));

        // 영어 대문자 확인
        char ch1 = 'G';
        System.out.println("영어 대문자 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));


        // 영문자 y 확인
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

        char ch5 = 'f';
        System.out.println("영문자인지 문자비교 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 아스키코드 숫자 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 문자비교 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 아스키코드 숫자 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));


    }
}
