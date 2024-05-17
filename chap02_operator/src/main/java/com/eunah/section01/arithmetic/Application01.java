package main.java.com.eunah.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 산술 연산자
         * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
         * 가장 많이 사용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
         * 피연산자들의 방향은 왼쪽에서 오른쪽이다.
         */


        /*
         * +, -, *, /, %
         */


        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2 : " + num1 + num2); // 처음 문자열이 나옴으로서 전체 문자열로 변환되어 207
        System.out.println("num1 + num2 : " + (num1 + num2)); // () 괄호 연산자가 우선순위
        // System.out.println("num1 + num2 : " + num1 - num2);  문자열은 더하기 연산자만 가능
        System.out.println("num1 + num2 : " + num1 * num2); // 더하기보다 곱하기가 우선순위라서 연산 이후 문자열로 형변환됨
        System.out.println("num1 + num2 : " + num1 / num2); // 더하기보다 나누기가 우선순위라서 연산 이후 문자열로 형변환됨
        System.out.println("num1 + num2 : " + num1 % num2); // 더하기보다 몫이 우선순위라서 연산 이후 문자열로 형변환됨


    }
}
