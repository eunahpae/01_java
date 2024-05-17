package main.java.com.eunah.section02.variable;

import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 수업 목적 : 변수의 사용 목적에 대하여 이해할 수 있다.
         *
         * 변수의 사용 목적
         * 1. 값에 의미를 부여하기 위한 목적 (의미 전달이 쉬어야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리
         * 2. 한 번 저장해 둔 값을 재사용 하기 위한 목적 (변수를 이용하여 코드를 작성하면 값을 변경할 떄도 보다 간편하게 변경할 수 있다.)
         * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변하는 값을 저장하기 위한 공간이다.)
         */

        System.out.println("----------값에 의미 부여 테스트---------");
        System.out.println("첫째 달 김과장님 보너스 포함 급여 : " + (300 + 20) + "만원");
        System.out.println("둘쨰 달 김과장님 보너스 미포함 급여 : " + 300 + "만원");

        int salary = 300;
        int bonus = 20;

        System.out.println("첫째 달 김과장님 보너스 포함 급여 : " + (salary + bonus) + "만원");
        /* 손으로 쓰는 사람의 휴먼에러를 방지할 수 있음 */

        /* 시간에 따라 변경되는 값을 저장하고 사용할 수 있다 */
        String name = " 김쿠팡";
        int point = 100;

        System.out.println(name + "은 쇼핑몰 중독이다." +
                "\n 지난달 " + name + "의 쿠팡 보너스 포인트는 " + point + "였다.");
        point += 100;
        System.out.println(name + " 이번달" + name + "의 쿠팡 보너스 포인트는 " + point + "이다.");


    }
}
