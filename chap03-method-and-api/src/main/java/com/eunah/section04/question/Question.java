package main.java.com.eunah.section04.question;

import main.java.com.eunah.section04.forquestion.ForQuestion;

import java.util.Random;

public class Question {
    public static void main(String[] args) {

        /*
         * -100에서 100 사이의 난수를 발생시켜서 매개변수로 전달하면 (0 은 고려 안함)
         * 매개변수가  양수면서 짝수면 x는 양수면서 짝수입니다.
         *                   홀수면 x는 양수면서 홀수입니다.
         *           음수면서 짝수면 x는 음수면서 짝수입니다.
         *                   홀수면 x는 음수면서 홀수입니다.
         * 를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력해보자.
         */


        /*
        * 처리순서)
        * 1. 타 패키지에 클래스 생성하여 삼항연산자 중첩구문으로 상기문제의 메시지를 반환하는 메소드 생성
        * 2. main 메소드 안에 -100~100 까지의 난수발생 코드 작성 (random 사용), 결과값을 변수에 저장
        * 3. 1번에서 생성한 클래스 임포트 / 객체 생성
        * 4. 해당 메소드 호출하여 인자값으로 1번의 변수를 전달
        * 5. 반환되는 값을 변수에 저장하여 출력
        */


        // 2. 난수 발생, 결과값 변수 저장
        Random rand = new Random();
        int randomNum1 = rand.nextInt(201) - 100;

        // 3. 타 패키지의 클래스 객체 생성, 1번의 변수를 인자값으로 전달 후 반환된 리턴값을 변수에 저장/출력
        ForQuestion forQ = new ForQuestion();
        String result = forQ.oddOrEven(randomNum1);
        System.out.println(randomNum1 + "은(는) " + result);
    }
}
