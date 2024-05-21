package main.java.com.eunah.section04.wrapper;

public class Application01 {
    public static void main(String[] args) {

        /* Wrapper
            상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다. (메소드가 인스턴스만 매개변수로 받는 경우 등)
            이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
            8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스(Wrapper class)라고 한다.

            기본타입          래퍼클래스
            byte             Byte
            short            Short
            int              Integer
            long             Long
            float            Double
            double           Double
            char             Character
            boolean          Boolean
        */

        /*
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱 이라고 하며,
         * 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱 이라고 한다.
         */


        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber2 = Integer.valueOf(intValue);

        int unboxingNumber = boxingNumber1.intValue();

        /*
         * 오토 박싱, 오토 언박싱
         *  JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다•
         *  이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱 이라고 부른다.
         */

        Integer boxingNumber3 = intValue; // 오토 박싱
        int unboxingNumber2 = boxingNumber3; // 오토 언박싱

        // Wrapper 클래스 값 비교
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // 기본 타입과 래퍼클래스 타입 == 연산
        System.out.println("int 와 integer 비교 = " + (inum == integerNum1));
        System.out.println("int 와 integer 비교 = " + (inum == integerNum2));

        // 생성자를 이용한 인스턴스 == 비교
        System.out.println("new integer 와 new integer 비교 : " + (integerNum1 == integerNum2));
        System.out.println("new integer 와 integer 비교 : " + (integerNum1 == integerNum3));
        System.out.println("integer 와 integer 비교 : " + (integerNum3 == integerNum4));

        // 오토박싱은 == 비교 가능
        System.out.println("equals() : " + (integerNum1.equals(integerNum2)));
        System.out.println("equals() : " + (integerNum1.equals(integerNum3)));


        /* Integer.valueOf() 를 이용하여 인스턴스를 생성하는 것을 더 권장한다.
           valueOf()는 동일한 값이 동일한 인스턴스 임을 보장한다. */
        System.out.println("valueOf() : " + (Integer .valueOf (123) == Integer.valueOf (123)));

    }
}
