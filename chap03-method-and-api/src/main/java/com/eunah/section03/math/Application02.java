package main.java.com.eunah.section03.math;

public class Application02 {
    public static void main(String[] args) {

        // 사용자 지정 범위의 난수를 발생시킬 수 있다.

        // 1. 난수 발생 0~9
        int random1 = (int) (Math.random() * 10); // 0.xxxx 이기 떄문에 양수 희망시 곱하기 추가
        System.out.println("0부터 9 사이의 난수 : " + random1);

        // 2. 난수 발생 1~10
        int random2 = (int) (Math.random() * 10)+1;
        System.out.println("1부터 10 사이의 난수 : " + random2);

        // 3. 난수 발생 10~15
        int random3 = (int) (Math.random() * 6)+10;
        System.out.println("10부터 15 사이의 난수 : " + random3);


    }
}
