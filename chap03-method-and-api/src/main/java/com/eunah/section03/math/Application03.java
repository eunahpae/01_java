package main.java.com.eunah.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {

        /*
         * java.util.Random 클래스
         * Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시키는 메소드
         */

        /*
         * 원하는 방식의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 범위) + 구하려는 난수의 최소값
         */

        Random random = new Random();

        // 1. 난수 발생 0~9
        int randomNum1 = random.nextInt(10);
        System.out.println("0부터 9 까지의 난수 : " + randomNum1);

        // 2. 난수 발생 1~10
        int randomNum2 = random.nextInt(10) + 1;
        System.out.println("1부터 10 까지의 난수 : " + randomNum2);

        // 3. 난수 발생 20~45
        int randomNum3 = random.nextInt(26) + 20;
        System.out.println("20부터 45 까지의 난수 : " + randomNum3);

    }
}
