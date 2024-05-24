package main.java.com.eunah.section02.enumType;

public class Application01 {
    public static void main(String[] args) {

        // 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며, 인스턴스가 1개임을 보장한다.
        Subject subject1 = Subject.JAVA;
        Subject subject2 = Subject.HTML;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else if (subject1 != subject2) {
            System.out.println("두 과목은 다른 과목입니다.");
        }


        // 단일 인스턴스가 보장된다.
        System.out.println(subject1 == Subject.JAVA);

        // 접두사를 쓰지 않아도 Enum 타입별로 네임스페이스를 가진다.
        /*
        * public enum Backend { JAVA,ORACLE, JDBC, JAVASCRIPT }
        * public enum Frontend { HTML, CSS, JAVASCRIPT }
        */

        System.out.println(Subject.JAVA.toString());

        // values() 이용해서 상수값 배열을 반환하고 이를 연속처리할 수 있다.
        Subject[] subjects = Subject.values();
        for (Subject s : subjects) {
            System.out.println(s);
        }

        // 타입 안정성을 보장한다.
        printSubject(Subject.HTML);
        // printSubject(2);

    }

    public static void printSubject(Subject subject) {
        System.out.println(subject.toString());
    }

}