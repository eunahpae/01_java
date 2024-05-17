package main.java.com.eunah.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 배열의 선언)
         * 자료형[] 변수명;
         */

        int[] iarray;
        int array[];    // 배열 선언하는 두가지 방법

        /*
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
         * 발생한 주소를 레퍼런스 주소에 저장하여 이것을 사용하기 때문에 참조자료형(reference type) 이라고 한다.
         */

        // 배열을 할당할 시에는 반드시 크기(길이)를 지정해 주어야 한다.
        iarray = new int[5];
        array = new int[4];

        int[] iarr = new int[5]; // 선언과 동시에 할당도 가능

        System.out.println(iarray);
        System.out.println(array);
        System.out.println(iarr);

        // hashCode() : 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        System.out.println(iarray.hashCode());
        System.out.println(array.hashCode());
        System.out.println(iarr.hashCode());

        // 스캐너를 통해 입력 받은 정수로 배열 길이를 지정
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요. : ");
        int size = sc.nextInt();

        int[] darr = new int[size];

        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 daee : " + darr.length);

        // 배열은 한번 지정한 크기를 변경할 수 없다. 오류가 나진 않지만, 배열의 값이 바뀐 게 아니라 새로운 주소공간을 갖게 됨
        darr = new int[50];

        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 daee : " + darr.length);

    }

}
