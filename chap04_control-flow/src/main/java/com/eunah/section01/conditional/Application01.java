package main.java.com.eunah.section01.conditional;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        A_if a = new A_if();
        // a.testSimpleIfStatement();
        // a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        // b.testSimpleIfElsaStatement();
        // b.testNestedIfElseStatement();

        C_ifElseIF c = new C_ifElseIF();
        // c.testSimpleIfElseIfStatement();
        // c.testNestedIfElseIfStatement();

        Scanner scr = new Scanner(System.in);
        // System.out.println("세 과목의 점수를 숫자로만 입력해주세요.(점수별 띄어쓰기 한칸)");
        // int score1 = scr.nextInt();
        // int score2 = scr.nextInt();
        // int score3 = scr.nextInt();

        Question question = new Question();
        // question.testResult(score1, score2, score3);

        D_switch d = new D_switch();
        // d.testSimpleSwitchStatement();
        d.testSwitchVandingMachine();

    }

}

