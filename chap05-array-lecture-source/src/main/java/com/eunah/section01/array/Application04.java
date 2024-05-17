package main.java.com.eunah.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {

        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "번 째 학생의 자바 점수를 입력해주세요. : ");
            scores[i] = sc.nextInt();

        }

        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

        }

        avg = sum / scores.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
