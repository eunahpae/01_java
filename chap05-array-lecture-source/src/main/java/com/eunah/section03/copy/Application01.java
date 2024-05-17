package main.java.com.eunah.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        /* 배열의 복사
           배열의 복사는 크게 두 가지 종류가 있다.
           1. 얕은 복사(shadow copy) : stack 의 주소값만 복사
           2. 깊은 복사(deep copy) : heap 의 배열에 저장된 값을 복사 */

        /* 얕은 복사는 stack 에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
           따라서 두 개의 변수는 동일한 주소값을 가지고 있다.
           하나의 변수에 저장된 주소값을 가지고 배열의 내용을 수정하게 되면
           다른 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.*/


        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = originArr;

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        for (int x : originArr) {
            System.out.println(x);
        }

        for (int x : copyArr) {
            System.out.println(x);
        }

        // 얕은 복사로 같은 주소값을 가졌기 때문에 하나만 값을 변경해서 양쪽에 전부 반영됨
        copyArr[0] = 99;
        for (int x : originArr) {
            System.out.println(x);
        }

        for (int x : copyArr) {
            System.out.println(x);
        }

    }

}
