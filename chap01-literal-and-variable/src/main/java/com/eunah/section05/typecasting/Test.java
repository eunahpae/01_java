package main.java.com.eunah.section05.typecasting;

public class Test {
    public static void main(String[] args) {

        /*
         * 5명의 학생이 있으며 학생의 키는 각각
         * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
         * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리는 절삭)
         * 화면에 보여지는 양식은 다음과 같다.
         * 1반 학생 5명의 평균 키는 ()cm 이다.
         */

        double student1 = 178.5;
        double student2 = 170.3;
        double student3 = 190.7;
        double student4 = 188.67;
        double student5 = 160.8;

        int average = (int) (student1 + student2 + student3 + student4 + student5) / 5;

        System.out.println("1반 학생 5명의 평균 키는 " + average + "cm 이다.");


        // 선생님 답변
        double total = 178.5 + 170.3 + 190.7 + 188.67 + 160.8;
        int all = (int) (total / 5);
        System.out.println("1반 학생 5명의 평균 키는 " + all + "cm 이다.");


    }
}
