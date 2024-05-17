package main.java.com.eunah.section03.increment;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 증감 연산자
         * ++X, X++ : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 증가시킨다.
         * --X, X-- : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 감소시킨다.
         *            기호가 앞인 경우 미리 증가 후 연산실행 / 뒤인 경우 연산 실행 후 증가
         */

        int num = 10;
        int num2 = 20;
        int result = 0;

        result = result * ++num; // num = num + 1
        System.out.println(result);
        System.out.println("num = " + num);

        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println("num = " + num);


    }
}
