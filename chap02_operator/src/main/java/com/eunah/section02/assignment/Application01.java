package main.java.com.eunah.section02.assignment;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 대입 연산자와 산술 복합 대입 연산자
        *
            ' = ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 대입한다.
            ' += ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 더한 결과를 대입한다.
            ' -= ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 뺀 값을 대입한다.
            ' *= ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 곱한 값을 대입한다.
            ' /= ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 결과를 대입한다.
            ' %= ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 나머지 결과를 대입한다.
        */


        int num = 12;

        num = num + 3;
        System.out.println(num);

        num += 3;
        System.out.println(num);

        num %= 5;
        System.out.println(num);

        num = 12;
        num *= 4.1; // num은 int형으로 정수로 변환됨. 연산을 진행한 후 정수형으로 변환되어 49 반환
        System.out.println(num);


    }
}
