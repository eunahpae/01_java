package main.java.com.eunah.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /* 깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사를 해 놓은 것이다.
           서로 같은 값을 가지고 있지만,
           두 배열은 서로 다른 배열이기에 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다. */

        /* 깊은 복사를 하는 방법은 4가지가 있다.
           1. for문을 이용한 동일 인덱스 복사
           2. object의 clone()을 이용한 복사
           3. System 의 arraycopy()를 이용한 복사
           4. Array의 copyOf()를 이용한 복사

           이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이다.
           가장 많이 사용되는 방식은 좀 더 유연한 방식인 copy() 메소드이다.
           clone() 의 경우 이전 배열과 같은 배열(동일한 길이) 밖에 만들 수 없다는 특징을 갖는다. */

        int[] originArr = new int[]{1, 2, 3, 4, 5};
        print(originArr);

        // 1. for 문을 이용한 동일한 인덱스 값 복사
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        System.out.println("---------------clone------------");
        // 2. clone() 을 이용한 복사
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        System.out.println("---------------arraycopy------------");
        // 3. arraycopy() 를 이용한 복사
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print(copyArr3);

        System.out.println("---------------copyOf------------");
        // 4. copyOf() 를 이용한 복사
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        print(copyArr4);



    }

    public static void print(int[] iarr) {
        System.out.println("iarr 의 hashCode : " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

}
