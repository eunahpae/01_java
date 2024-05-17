package main.java.com.eunah.section06.temary.test;

public class test {
    public static void main(String[] args) {

        /*
           영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점, 4번 학생은 88점을 맞았다.
           90~100점 사이에 있는 학생은 합격, 아니라면 불학격을 출력하자.
         */

        int st1 = 90;
        int st2 = 95;
        int st3 = 81;
        int st4 = 88;

        // int ave = (st1 + st2 + st3 + st4) / 4;

        String resultSt1 = (st1 >= 90) ? "합격" : "불합격";
        String resultSt2 = (st2 >= 90) ? "합격" : "불합격";
        String resultSt3 = (st3 >= 90) ? "합격" : "불합격";
        String resultSt4 = (st4 >= 90) ? "합격" : "불합격";

        System.out.println("1번 : " + resultSt1 + ", 2번 : " + resultSt2 + ", 3번 : " + resultSt3 + ", 4번 : " + resultSt4);

    }
}
