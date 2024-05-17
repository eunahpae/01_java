package main.java.com.eunah.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        /*
         * [while 문 표현식]
         *
         * 초기식;
         * whilel(조건식) {
         *       조건을 만족하는 경우 수행할 구뭄ㄴ(반복할 구문);
         *       증감식;
         * }
         */

        // 1부터 10까지 증가시키면서 출력하는 기본 반복문
        int i = 1;

        while (i <= 10) {

            System.out.println(i);
            ++i;

        }


    }


    public void testWhileExample() {

        // 입력한 문자열의 인덱스를 이용하여 하나씩 출력해보기


        // 문자열 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        /*
         * charAt() - 문자열에서 인덱스에 해당하는 문자를 char형으로 바꿔주는 기능
         * length() - String 문자열의 길이를 반환
         */


        System.out.println("----------------for 문 ---------------");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(ch + " " + i);


        }

        System.out.println("----------------while 문 ---------------");

        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            System.out.println(ch + " " + index);
            ++index;

        }
    }


    public void testWhileExample2() {

        // 정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계를 구한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력해주세요 : ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;

        }
        System.out.println("1부터 입력받은 정수 " + num + "까지의 합은 " + sum);

    }

}
