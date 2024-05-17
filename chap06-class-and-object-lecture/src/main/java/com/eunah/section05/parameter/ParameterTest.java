package main.java.com.eunah.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {

        /*
         * 배열의 주소가 전달된다.
         * 즉, 인자로 보내는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열을 가리킨다. (얕은 복사)
         */

        System.out.println("iarr : " + iarr);
        System.out.println("배열의 값 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;
        System.out.println("변경 후 값 출력 : " + iarr);
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }


    public void testClassTypeParameter2(RactAngle ractAngle) {
        System.out.println("매개변수로 전달받은 값 : " + ractAngle);

        System.out.println("변경 전 사각형의 넓이와 둘러 : ");
        ractAngle.calcArea();
        ractAngle.calcRound();

        System.out.println("변경 후 사각형의 넓이와 둘러 : ");
        ractAngle.setWidth(100);
        ractAngle.setHeight(100);
        ractAngle.calcArea();
        ractAngle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String... hobby) {

        System.out.println("name = " + name);
        System.out.println("hobby = " + hobby.length);
        System.out.print("hobby = ");
        for (String hobbys : hobby) {
            System.out.print(hobbys + " ");
        }
        System.out.println();
    }


}
