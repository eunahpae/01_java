package main.java.com.eunah.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
         * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
         * 다은 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리한다.
         */

        int inum = 10;
        long lnum = 10L;

        int isum = inum + (int) lnum;
        isum = (int) (inum + lnum);

        byte bnum = 1;
        short snum = 2;
        short sum2 = 3;
        short snum3 = 4;

        int result1 = bnum + snum;
        int result2 = sum2 + bnum;
        //


    }
}
