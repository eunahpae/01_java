package main.java.com.eunah.section01.literal;

public class Application02 {
    public static void main(String[] args) {

        /*  목차 1. 정수 리터럴 연산 형식의 값을 직접 연산한다. */

        /*
         * 1. 123 + 456
         * 2. 123 - 456
         * 3. 123 * 456
         * 4. 40 / 10
         * 5. 10 % 2
         */

        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);


        /* 목차 2. 정수와 실수 연산 : 정수와 실수랑 연산하면 실수로 형변환된다. */
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        System.out.println("--------------------------------------------");
        /* 목차 3. 문자와 문자의 연산 */
        /* 필기 문자 끼리의 연산도 사칙 연산 가능하다 */
        /* 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산 사용이 가능하다는 것에 집중하자 */
        System.out.println('a' + 'b');
        System.out.println('ㄱ' + 'ㄴ');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("--------------------------------------------");
        /* 목차 4. 문자열은 + 연산만 가능하다  : 문자열과의 연산은 모두 문자열로 합쳐진다 */
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        System.out.println("123" + "456");
        System.out.println("a" + "b");

        /* 목차 5. 논리형 연산 */
        // System.out.println(true + false);  --불가능
        System.out.println(true + "false");
        // System.out.println(true + 1); --불가능

        System.out.println("안녕" + "하세" + "요");
    }
}
