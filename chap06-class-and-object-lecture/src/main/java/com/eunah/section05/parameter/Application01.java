package main.java.com.eunah.section05.parameter;

public class Application01 {
    public static void main(String[] args) {

        /* 매개변수(parameter) 로 사용 가능한 자료형
        1.기본 자료형
        2.기본 자료형 배열
        3.클래스 자료형
        4.클래스 자료형 배열 */

        ParameterTest pt = new ParameterTest();

        // 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        // 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인
        int[] iarr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("인자로 전달하는 주소값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("변경 후 원본배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        // 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 확인
        RactAngle r1 = new RactAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 r1의 값 : " + r1);

        // 직접 ractangle 접근
        r1.calcArea();
        r1.calcRound();

        // 매개변수 전달
        pt.testClassTypeParameter2(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        r1.calcArea();
        r1.calcRound();

        // 5. 가변인자를 매개변수로 전달 받는 메소드 호출 확인

        // pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홀길동");
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
        pt.testVariableLengthArrayParameter("안중근", new String[]{"수영", "당구"});

    }
}