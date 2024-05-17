package main.java.com.eunah.section04.construct;

import java.util.Date;

public class User {

    private String id;

    private String pwd;

    private String name;

    private Date enrollDate;


    /* 생성자의 작성 위치
       작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만
       통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.

       생성자의 사용 목적
       인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
       매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며
       인스턴스를 생성할 목적으로 주로 사용된다.
       작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
       따라서 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다. (초기값 전달 강제화) */


    /* 생성자의 작성 방법
      [표현식]
        접근제어자 클래스명(매개변수 {
        인스턴스생성 시점에 수행할 명령 기술 ( 주로 필드를 초기화)
        this.필드명 = 매개변수;
        }

      생성자 작성시 주의할 점
      생성자 메소드는 반드시 클래스의 이름과 동일해야 한다.(대/소문자까지 같아야함)
      생성자 메소드는 반환형을 작성하지 않는다.(작성하는 경우 생성자가 아닌 메소드로 인식한다.)

      생성자의 종류
      기본생성자 (매개변수가 없는 생성자)
      매개변수가 있는 생성자
      기본생성자는 자바 컴파일러가 자동으로 추가 해주지만 명시적으로 작성할 수도 있다.
      매개변수가 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
      기본생성자도 필요한 경우에는 반드시 작성 해주어야 한다. */


    // 기본생성자
    public User() {
        System.out.println("기본생성자 호출됨..");
    }

    // 모든 필드를 초기화하는 생성자
    public User(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    // 2개의 필드를 초기화하는 생성자
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // 1개의 필드를 초기화하는 생성자
    public User(String id) {
        this.id = id;
    }

    public String geyInfomation() {
        return "User [id = " + this.id + ", pwd = " + this.pwd + ", name = " + this.name + ", enrollDate = " + this.enrollDate +"]";
    }


}
