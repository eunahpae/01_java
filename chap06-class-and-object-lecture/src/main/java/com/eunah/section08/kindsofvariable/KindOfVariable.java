package main.java.com.eunah.section08.kindsofvariable;

public class KindOfVariable {

    // 다양한 변수들을 이해하고 사용할 수 있다.

    /*다양한 변수 이해
    필드 :클래스 영역에 작성하는 변수
    필드 == 멤버변수 == 전역변수
    non-static field 를 인스턴스변수라고 한다.(인스턴스 생성 시점에 사용 가능한 변수)*/
    private int globalNum;

    // static field 를 정적필드(클래스 변수)라고 한다. (정적 영역에 생성되는 변수라는 의미)
    private static int staticNum;

    public void testMethid(int num) {

        /* 메소드 영역에서 작성하는 변수를 지역변수하고 한다.
           메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
           매개변수도 일종의 지역변수로 생각하면 된다.
           지역변수와 매개변수 모두 메소드 호출시 stack 을 할당받아 stack 에 생성된다. */

        int localNum;
        System.out.println(num);
        // System.out.println(localNum);

        System.out.println(globalNum);
        System.out.println(staticNum);

        localNum = 20;
        System.out.println(localNum);

    }

    public void testMethod2(){
        // System.out.println(localNum);
        System.out.println(globalNum);
        System.out.println(staticNum);
    }


}
