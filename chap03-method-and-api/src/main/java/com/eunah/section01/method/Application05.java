package main.java.com.eunah.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
           return 이란?

           모든 메소드 내부에는 return; 이 존재해야 한다.
           void 메소드의 경우 return; 을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해 처리한다. (생략가능)
           return 은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다. 그렇기 때문에 return 구문 이후 작성된 것은 동작하지 않는다.
         */

        System.out.println("main() 메소드 시작...");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main() 메소드 종료...");

    }

    public void testMethod() {

        System.out.println("testMethod() 동작 확인");
        return; // void 구문은 알아서 return; 을 추가해주기 때문에 생략 가능

        // System.out.println("test");  return 을 만나면 메소드 종료, 뒤에 어떤 구문을 작성해도 동작X

    }
}
