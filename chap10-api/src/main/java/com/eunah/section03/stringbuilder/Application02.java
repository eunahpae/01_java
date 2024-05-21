package main.java.com.eunah.section03.stringbuilder;

public class Application02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        // capacity() : 용량(현재 버퍼의 크기)를 정수형으로 반환하는 메소드(문자열 길이 + 16이 기본용량)
        System.out.println("sb1.capacity() = " + sb1.capacity());

        /* append() :인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
                     기본 용량을 초과하는 경우(기존 문자열+1)*2를 하여 용량을 확장시킨다. */

        for (int i = 0; i < 50; i++) {
            sb1.append(i);
            System.out.println("sb1 = " + sb1);
            System.out.println("sb1.capacity() = " + sb1.capacity());
            System.out.println("sb1.hashCode() = " + sb1.hashCode());
        }

        // 새로운 인스턴스 생성
        StringBuilder sb2 = new StringBuilder("javaoracle");

        /*
         * delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
         * deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         * 둘 다 원본에 영향을 미친다.
         */

        System.out.println("delete() : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));
        System.out.println("sb2 = " + sb2);

        /*
        * insert() : 인자로 전달된 값을 문자열로 변환 후 저장된 인덱스 위치에 추가한다.
        * 원본에 영향을 미친다.
        */

        System.out.println("sb2.insert(1,\"vao\") = " + sb2.insert(1,"vao"));
        System.out.println("sb2.insert(0,\"j\") = " + sb2.insert(0,"j"));
        System.out.println("sb2.insert(sb1.length(),\"jdbc\") = " + sb2.insert(sb2.length(),"jdbc"));
        System.out.println("sb2 = " + sb2);
        
        /*
        * reverse() : 문자열 인덱스 순번을 역순으로 재배열 한다.
        * 원본에 영향을 미친다.
        */

        System.out.println("sb2.reverse() = " + sb2.reverse());
        System.out.println("sb2 = " + sb2);

        /*
        * String 클래스와 동일한 메소드도 있다.
        * charAt(), indexOf() / lastIndexOf(), length(), replace(), subString(), toString()
        */

    }
}
