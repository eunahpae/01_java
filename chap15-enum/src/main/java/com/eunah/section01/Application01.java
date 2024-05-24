package main.java.com.eunah.section01;

public class Application01 {
    public static void main(String[] args) {

        // 정수 열거 타입의 단점을 이해할 수 있다.

        // 1. 정수값만을 가지고 있는 필드일 뿐이다.
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        // 2. 이름 충돌 방지를 위해 접두어를 써서 구분해야 한다.
        /*
         * BACKEND_JAVASCRIPT = 0;
         * FRONTEND_JAVASCRIPT = 0;
         */

        int num = 0;
        String subjectText = "";

        switch (num) {
            case Subjects.JAVA:
                subjectText = "JAVA";
                break;
            case Subjects.ORACLE:
                subjectText = "ORACLE";
                break;
            case Subjects.JDBC:
                subjectText = "JDBC";
                break;

        }
        System.out.println("subjectText" + subjectText);

        // 3. 반복문을 사용할 수 없다. (전체 상수 갯수도 확인할 수 없다.)
        // 4. 타입의 안전을 보장할 수 없다.
        printSubject(Subjects.ORACLE);
        printSubject(2);
    }

    public static void printSubject(int subjectNumber) {
        String subject = "";

        switch (subjectNumber) {
            case Subjects.JAVA:
                subject = "JAVA";
                break;
            case Subjects.ORACLE:
                subject = "ORACLE";
                break;
            case Subjects.JDBC:
                subject = "JDBC";
                break;

        }
        System.out.println("subject = " + subject);
    }
}
