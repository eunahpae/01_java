package main.java.com.eunah.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*
         * [for문 표현식]
         * for(초기식; 조건식; 증감식) {
         *       조건을 만족하는 경우 스행할 구문 (반복할 구문);
         * }
         */

        // 1부터 10까지 증가시키면서 출력될 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public void testForExample1() {

        // 10명의 학생 이름을 받아 출력해보자.
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("1번 학생의 이름을 입력해주세요. : ");
        String st1 = sc.nextLine();
        System.out.println("1번 학생의 이름은 " + st1 + "입니다.");
        반복문을 사용하지 않으면, 이 3줄을 원하는 만큼 복사해서 넣기때문에 코드가 너무 길어짐.
        */

        /*
         * 1. 안내문구
         * 2. 이름 받는 부분
         * 3. 이름 출력
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "번쨰 학생의 이름을 입력해주세요. :");
            String st = sc.nextLine();
            System.out.println(i + "번쨰 학생의 이름은 " + st + "입니다.");
        }

    }


    public void testForExample2() {

        // 1부터 10까지 합계를 구하시오.

        int sum = 0;
        for (int i = 0; i <= 10; i++) {

            sum += i;

        }
        System.out.println(sum);

    }


    public void testForExample3() {

        // 숫자 2개를 입력 받아서 작은 수부터 큰 수까지의 합계를 구한다.

        // 숫자 입력 - 스캐너 이용
        // 큰 수 확인
        // 작은 수를 초기식에 넣고, 큰 수가 될 떄까지 반복

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();

        int sum = 0;

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum += i;
            }

        } else {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        }

        System.out.println(sum);

    }

    public void printGugudan() {

        // 2~9 사이의 값을 입력 받아
        // 2~9 사이의 값이 제대로 들어 왔으면 해당 구구단 출력하고,
        // 그렇지 않은 경우는 "반드시 2~9 사이의 양수를 입력해야 합니다" 라고 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수를 입력해주세요. :");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
        }

    }

}
