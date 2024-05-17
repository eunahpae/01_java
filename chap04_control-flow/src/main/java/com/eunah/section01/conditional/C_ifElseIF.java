package main.java.com.eunah.section01.conditional;

import java.util.Scanner;

public class C_ifElseIF {
    public void testSimpleIfElseIfStatement() {

        /*
         * [if-else-if 조건식]
         * if(조건식1) {
         *       조건식1이 true일 때 실행할 명령문;
         * } else if(조건식2) {
         *       조건식1이 false이고 조건식 2가 true일 때 실행할 명령문;
         * } else {
         *       위의 조건 2개가 모두 false인 경우 실행할 명령문;
         * }
         */

        // 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오 코드를 만들어보자.

        Scanner scr = new Scanner(System.in);
        System.out.println("어느 도끼가 너의 도끼냐? (1.금도끼  2.은도끼  3.쇠도끼) 숫자를 입력하세요 : ");
        int num = scr.nextInt();

        if (num == 1) {
            System.out.println("이런 거짓말쟁이! 너에게는 아무런 도끼도 줄 수 없다!!");
        } else if (num == 2) {
            System.out.println("욕심이 과하지는 않지만 그래도 거짓말을 하고 있구나!");

        } else if (num == 3) {
            System.out.println("정직하구나, 금도끼/은도끼/쇠도끼 다 가져가거라.");

        } else {
            System.out.println("줘도 못갖네");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 사라졌습니다.끝");

    }

    public void testNestedIfElseIfStatement() {

        /*
         * ohgiraffers 대학의 XX교수님은 학생들의 시험 성적으로 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D' 를
         * 60점 미만인 경우에는 'F' 를 학점 등급으로 하는 기준이다.
         * 추가로 각 등급의 중간점수(95,85,75,65)를 넘는 경우는 '+'를 붙여서 세분화 하다보니 신경쓸게 이만저만이 아니다.
         * 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         */

        // 1. 90점이 넘는지, 80점이 넘는지, 70점이 넘는지 확인
        // 2. 중간점수가 넘는지 확인

        Scanner scr = new Scanner(System.in);
        System.out.println("학생이름을 입력해주세요.");
        String name = scr.nextLine();
        System.out.println("점수를 입력해주세요.");
        int point = scr.nextInt();

        String grade = "";

        if (point >= 90) {

            grade = "A";

            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        if (grade.equals("F")) {
            System.out.println(name + "힉생은 F등급입니다. 재수강하세요.");
        } else {
            System.out.println(name + "힉생은 " + grade + "등급입니다.");
        }

    }
}
