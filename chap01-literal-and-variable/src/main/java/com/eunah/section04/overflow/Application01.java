package main.java.com.eunah.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 자료형별 최대 범위를 벗어나는 경우
         */

        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;  // 범위를 벗어나기 때문에, 해당 자료형의 제일 작은 값을 호출
        System.out.println("num1 : " + num1);

        /*
         * 언더 플로우
         * 오버 플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--; // 법위를 벗어나기 때문에, 해당 자료형의 제일 큰 값을 호출
        System.out.println("num2 : " + num2);

        int firstNum = 10000000;
        int secondNum = 7000000;
        int multi = firstNum * secondNum;
        System.out.println(multi);


        // 오버플로우를 해결하려면? int 보다 범위가 큰 자료형 long으로 형변환
        long multi2 = (long) firstNum * secondNum;
        System.out.println(multi2);


    }
}
