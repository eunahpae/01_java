package main.java.com.eunah.section02.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         * 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램
         *
         * 사용자로부터 시작 숫자와 끝 숫자를 입력받는다.
         * 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력한다.
         * 소수 = 1과 자기 자신을 제외한 수로 나누에 떨어지지 않는 수
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("시작 숫자를 입력하세요 : ");
        int sNum = scr.nextInt();
        System.out.println("마지막 숫자를 입력하세요 : ");
        int eNum = scr.nextInt();

        System.out.println(sNum + " ~ " + eNum + " 사이의 소수는 :");

        // case 1.
        for (int i = sNum; i < eNum; i++) {
            boolean isTrue = true; // 현재 숫자가 소수인지 확인 저장

            // 2부터 반복하여 소수인지 확인
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break; // 현재 숫자가 j로 나누어 떨어지면 소수가 아니므로 false 반환, 내부 반복문 종료
                }
            }

            // 소수인 경우 출력
            if (isTrue == true) {
                System.out.print(i + " ");
            }
        }

        // case 2. 소수체크 메소드 생성, 범위 내 숫자를 소수체크 메소드 를 통해 소수인지 확인하여 소수인 경우 출력
        findPrime(sNum, eNum);

    }

    // 소수인지 체크하는 메소드
    public static boolean isPrime(int num) {
        if (num <= 1) // 1보다 작거나 같은 수는 소수가 아니므로 false 반환
            return false;
        for (int i = 2; i < num; i++) { // num이 i로 나누어 떨어지면 소수가 아니므로 false 반환
            if (num % i == 0)
                return false; // num이 i로 나누어 떨어지면 소수가 아니므로 false 반환
        }
        return true; // 소수인 경우 true 반환
    }

    // 범위 내 소수 찾는 메소드
    public static void findPrime(int sNum, int eNum) {
        System.out.println(sNum + " ~ " + eNum + " 사이의 소수는 :"); // 시작 숫자부터 끝 숫자까지의 소수 출력

        for (int num = sNum; num <= eNum; num++) { // 시작 숫자부터 끝 숫자까지 반복
            if (isPrime(num)) // 만약 num이 소수이면
                System.out.print(num + " "); // num 출력

        }
    }

}
