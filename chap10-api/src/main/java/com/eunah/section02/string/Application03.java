package main.java.com.eunah.section02.string;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능
        * split() : 정규표현식을 이용하여 문자열을 분리한다.
        *           비정형화 된 문자열을 분리할 때 졸지만 (공백 문자열 값 포함)
        *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        *
        * StringTokenizer() : 문자열의 모든 문자열을 구분자로 하여 문자열을 분리한다.
        *                     정형화된 문자열 패턴을 분리할 때 사용하기 좋다.(공백 문자열 무시)
        *                     split() 보다 속도면에서 더 빠르다.
        *                     구분자를 생략하는 경우 공백이 기본 구분자이다.
        */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "200/유관순/경기도";





    }
}
