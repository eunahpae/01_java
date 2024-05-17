package main.java.com.eunah.section02.looping;

import java.util.Scanner;

public class A_nestesFor {

    public void printGugudanFromTwoToNine() {

        // 2단부터 단을 1단씩 증가시키는 반복문

        //1단씩 증가
        for (int dan = 2; dan < 10; dan++) {

            // 1부터 9까지 단에 곱해주기
            for (int su = 1; su < 10; su++) {

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(" ");
        }

    }

    public void printUpgradeGugudan() {

        // 2~9 단 증가
        for (int dan = 2; dan < 10; dan++) {

            printGugudan(dan);

            System.out.println(" ");
        }

        // 단을 매개변수로 전달
    }

    public void printGugudan(int dan) {

        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printTriangleStars() {

        // 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*" 을 행의 번호개씩 출력하세요.

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력 해주세요. : ");
        int row = sc.nextInt();

        // 출력할 행
        for (int i = 0; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // 행 수만큼 별 출력

    }
}
