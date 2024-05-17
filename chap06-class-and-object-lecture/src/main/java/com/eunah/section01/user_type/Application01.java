package main.java.com.eunah.section01.user_type;

public class Application01 {
    public static void main(String[] args) {

        // 클래스가 무엇인지 이해하고 작성할 수 있다.

        /*
         * 회원 데이터 관리 (아이디, 비밀번호, 이름, 나이, 성별, 취미)
         */


        // 1. 변수를 이용한 데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "배은아";
        int age = 20;
        char gender = '여';
        String[] hobby = new String[]{"축구", "볼링", "수영"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " + hobby);
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        /* 이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
           1. 변수명을 다 관리해야 하는 어려움이 생긴다.
           2. 모든 회원 정보를 인자로 메소드 호출 시 전달하면 너무 많은 값들을 인자로 전달해야 하기에 한눈에 안 들어온다.
           3. 리턴은 1개의 값만 가능하기 떄문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.(서로 다른 자료형이기 떄문에) */

        /* 클래스를 이용한 객체 생성
          자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
          사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap 에 할당을 해야한다.
          객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
          아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다. */

        Member gildong = new Member();

        /* 필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
           “.”은 참조연산자 라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
           각 공간은 필드명으로 접근한다.(배열은 인덱스로 접근, 객체는 필드명으로 접근한다.) */

        // 필드에 접근해서 변수 사용하듯 사용하기
        gildong.id = "user01";
        gildong.pwd = "pass01";
        gildong.name = "홍길동";
        gildong.age = 20;
        gildong.gender = '남';
        gildong.hobby =new String[]{"축구", "볼링", "수영"};

        System.out.println("gildong.id = " + gildong.id);
        System.out.println("gildong.pwd = " + gildong.pwd);
        System.out.println("gildong.name = " + gildong.name);
        System.out.println("gildong.age = " + gildong.age);
        System.out.println("gildong.gender = " + gildong.gender);
        System.out.println("gildong.hobby = " + gildong.hobby);
        for (int i = 0; i < gildong.hobby.length; i++) {
            System.out.print(gildong.hobby[i] + " ");
        }
        System.out.println();


    }


}
