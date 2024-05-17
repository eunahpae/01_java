package main.java.com.eunah.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차 정렬

        // 초기 배열 선언
        int[] iarr = {2, 5, 6, 4, 1, 3};

        for (int i = 1; i < iarr.length; i++) {

            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }

            }

        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
    }
}
