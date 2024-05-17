package main.java.com.eunah.section05.logical;

public class Application03 {
    public static void main(String[] args) {

        /*
           논리식 && : 앞의 결과가 false 이면 뒤의 연산을 실행하지 않음.
           논리식 || : 앞의 결과가 true 이면 뒤의 연산을 실행하지 않음.
         */

        System.out.println("------------&&-----------");
        int num1 = 10;
        int result = (false && ++num1 > 0) ? num1 : 20;
        System.out.println(result);
        System.out.println(num1);

        System.out.println("------------||-----------");
        int num2 = 20;
        int result2 = (true || ++num2 > 0) ? num2 : 30;
        System.out.println(result2);
        System.out.println(num2);


    }
}
