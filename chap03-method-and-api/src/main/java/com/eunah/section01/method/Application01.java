package main.java.com.eunah.section01.method;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이다.
         */

        System.out.println("main() 메소드 시작됨...");

        // 아래 작성한 methodA 메소드를 호출
        /* static이 있는 메소드에서 static이 없는 메소드를 호출할 때 new 로 클래스 초기화 필수,
           methodA에는 static이 없기때문에 클래스초기화 없이 바로 호출 가능 */
        Application01 app = new Application01();
        app.methodA();

        System.out.println("main() 메소드 종료됨...");

    }

    // void는 아무것도 반환하지 않겠다는 뜻
    public void methodA() {

        System.out.println("methodA 호출");

        methodB();  // methodA에는 static이 없기때문에 클래스초기화 없이 바로 호출 가능
        System.out.println("methodA 종료");

    }

    public void methodB() {

        System.out.println("methodB 호출");

        System.out.println("methodB 종료");

    }

}
