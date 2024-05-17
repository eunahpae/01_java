package main.java.com.eunah.section02.demensional;

public class Application01 {
    public static void main(String[] args) {

        /* 다차원 배열
           다차원 배열은 1차원 이상의 배열을 의미한다.

           배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
           즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
           더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 배열은 사용 빈도가 현저히 적다. */

        /* 2차원 배열을 사용하는 방법
           1. 배열의 주소를 보관할 래퍼런스 변수를 선언
           2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성
           3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
           4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용 */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        iarr1 = new int[3][]; // 앞의 길이만 필수 지정
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        iarr2 = new int[3][5];

        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.println(iarr1[0][i]+" ");
        }

        for (int i = 0; i < iarr1[1].length; i++) {
            System.out.println(iarr1[1][i]+" ");
        }

        for (int i = 0; i < iarr1[1].length; i++) {
           for (int j = 0; j < iarr1[0].length; j++) {
               System.out.println(iarr1[1][j]+" ");
           }
        }

    }

}
