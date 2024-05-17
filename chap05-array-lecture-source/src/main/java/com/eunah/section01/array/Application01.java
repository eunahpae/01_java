package main.java.com.eunah.section01.array;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 배열이란?
         * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위함)이다.
         * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         *
         * 배열의 사용 이유)
         * 1. 만약 배열을 사용하지 않는다면 여러 개의 변수를 사용해야 한다.
         * 2. 만약 배열을 사용하지 않는다면 반복문을 이용한 연속 처리가 불가능하다.
         */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;   // 배열을 사용하지 않는 경우, 이런식으로 작성해야하는 번거로움

        System.out.println(sum);
        System.out.println("--------배열 사용----------");

        int[] array = new int[5]; // 길이 지정 필요

        // 배열은 공간마다 찾아갈 수 있는 인덱스를 이용해 접근할 수 있다.
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[5] = 60;

        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
            // System.out.println(sum2);
        }
        System.out.println("array = " + sum2);

        // sum2 += array[0];

    }
}
