package main.java.com.eunah.section05.overloading;

public class OverloadingTest {

    /* 오버로딩의 사용 이유
       매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
       이 때, 동일한 기능의 메소드를 매개변수에 따라 이름을 다르게 정의하면 복잡하고 관리하기가 매우 어려울 것이다.
       규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
       따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 관리하기 위해 사용하는 기술을 오버로딩 이라고 한다.


       대표예시 : println();
       */


    /* 오버로딩의 조건
        동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 개수, 순서를 다르게 작성하여 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있다.
        메소드의 시그니처가 다르면 다른 메소드로 인식하기 때문이다.
        즉, 시그니처 중 메소드 이름을 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.

        메소드의 시그니처란?
        public void method(int num){} 이라는 메소드에서 메소드명과 파라미터 선언부 부분을 시그니처 라고 한다.
                method(int num) 이 부분이 시그니처.
        메소드이 시그니처가 달라야 하기 때문에 접근제어자나 반환형은 오버로딩 성립조건에 해당하지 않는다. */


    public void test() {

    }

    /* 같은 메소드 불가

    public void test() {

    } */

    /* 종류 바꿔도 불가

    private void test() {

    } */

    /* 반환타입 바꿔도 불가

    public int test() {

    } */


    // 매개변수의 타입, 순서, 개수를 다르게 작성하면 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있음
    public void test(int a) {

    }

    public void test(int a, int b) {

    }

    public void test(String c) {

    }

    public void test(int a, int b, String c) {

    }

    public void test(int a, int b, int c) {

    }


}
