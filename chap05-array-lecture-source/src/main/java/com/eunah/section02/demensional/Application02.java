package main.java.com.eunah.section02.demensional;

public class Application02 {
    public static void main(String[] args) {

        // 선언과 할당을 동시에 할 수 있다.

        // 정변배열  (3행 5열)
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        // int iarr1[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        // 반복문을 이용한 값 출력
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        // 가변 배열
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        // 미리 할당한 배열을 이용한 방식
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};

        int[][] iarr3 = {arr1, arr2};
        for (int i = 0; i < iarr3.length; i++) {
            for (int j = 0; j < iarr3[i].length; j++) {
                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
