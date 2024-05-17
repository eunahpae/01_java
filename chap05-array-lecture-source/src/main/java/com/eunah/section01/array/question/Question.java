package main.java.com.eunah.section01.array.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        // 배열의 최솟값, 최댓값 찾기

        // 배열 길이는 스캐너로 입력 받아서 요소마다 정수를 넣어줌
        // 해당 배열의 최솟값과 최댓값을 출력해주는 기능 만들기

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이(정수)를 입력해주세요 : ");
        int length = sc.nextInt();
        int[] larr = new int[length];

        // 입력받은 수(배열길이)만큼 입력 안내 메시지 출력 및 값 배열 저장
        for (int i = 0; i < larr.length; i++) {
            System.out.println((i + 1) + "번 째 숫자를 입력해주세요. : ");
            larr[i] = sc.nextInt();
        }

        // min, max 변수 생성 , 배열의 첫번째 값으로 초기화
        int min = larr[0];
        int max = larr[0];
        int secondMax = larr[1];
        int secondMin = larr[1];


        // 반복문 안에 조건문을 넣어서 큰 값 혹은 작은 값만 남기기
        // min, max 에 인덱스[0] 값을 넣었기 때문에 대상은 인덱스[1]부터 시작하여 배열 길이만큼 비교
        for (int i = 1; i < larr.length; i++) {

            if (larr[i] < min) {
                secondMin = min;
                // min 값보다 작으면 true, min 값 변경 저장됨. 크면 false 로 다음 인덱스값과 반복
                min = larr[i];

            } else if (larr[i] < secondMin || secondMin == min) {
                secondMin = larr[i];
            }

            // min 과 마찬가지로 비교
            if (larr[i] > max) {
                secondMax = max;
                max = larr[i];

                // array[i] 가 max 보다 크지 않고 secondMax 보다 클 경우 secondMax 에 넣어줌. second 랑 max 가 같을 때도 실행
            } else if (larr[i] > secondMax && larr[i] != max) {
                secondMax = larr[i];

                /* else if ((larr[i] > secondMax && larr[i] != max) || (secondMax == max && secondMax != max)) {
                secondMax = larr[i]; */
            }

        }

        System.out.println("Min: " + min + ", Max: " + max + ", Second Min: " + secondMin + ", Second Max: " + secondMax);

    }
}

