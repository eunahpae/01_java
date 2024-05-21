package main.java.com.eunah.section03.stringbuilder;

public class Application01 {
    public static void main(String[] args) {

        /* StringBuilder/Buffer
            두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.

            StringBuilder : 스레드 동기화 기능 제공하지 않음
                            스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer 보다 성능이 좋음

            StringBuffer : 스레드 동기화 기능 제공함.
                           성능면에서는 StringBuilder 보다 느림

            두 개의 차이는 스레드 동기화 유무이고, 기능의 차이는 없음 */

        /* String과 StringBuilder
            String = 불변이라는 특징을 가지고 있다.
                     문자열에 + 연산으로 합치는 경우, 기존 인스턴스를 수정하는 것이 아닌 새로운 인스턴스를 반환한다.
                     따라서 문자열 변경이 자주 일어나는 경우에는 성능 면에서 좋지 않다.
                     하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
                     StringBuilder = 가변이라는 특징을 가지고 있다.
                     문자열에 append() 메소드를 이용하여 합치는 경우
                     기존 인스턴슬르 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
                     따라서 잦은 문자열 변경이 일어나는 경우 String 보다 성능이 좋다.

            단, Jdk 1.5 이후 버전에서는 문자열의 + 연산이 StringBuilder의 append()로 컴파일된다.
            따라서 성능에 큰 차이를 보이지 않는다.
            하지만 반복문에서 문자열의 + 연산을 수행하는 경우 StringBuilder 인스턴스를
            반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.

             ------------------------------------
             String str1 = "java";
             String str2 = "oracle";
             String str3 = str1+str2;
             String str4 = "";
             for(int i = 0; i < 10; i ++){
                   str4 += str1;
             }

             jdk 1.4 이하
             ----------------------------------------------
             String str1 = "java";
             String str2 = "oracle";
             String str3 = str1 +str2;
             String str4 = "";
             for(int i = 0; i < 10; i ++){
                   str4 += str1;
             }

             jdk 1.5 이상
             ----------------------------------------
             String str1 = "java";
             String str2 = "oracle";
             String str3 = new StringBuilder(str1).append(str2).toString();
             String str4 = "";
             for(int i = 0; i < 10; i ++){
                   str4 += new StringBuilder(str4).append(str1).toString();
             }

             직접 이용
             --------------------------------------------------
             String str1 = "java";
             String str2 = "oracle";
             String str3 = new StringBuilder(str1).append(str2).toString();
             StringBuilder str4 = new StringBuilder("");
             for(int i = 0; i < 10; i ++){
                    str4.append(str1);
             }
        */

        // 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        // toString 오버라이딩 되어있음
        System.out.println("sb = " + sb);

        // hashCode 는 되어있지 않음
        System.out.println("sb.hashCode() = " + sb.hashCode());
        
        // 문자열 수정 - 문자가 추가되도 주소값이 바뀌지 않음
        sb.append("oracle");
        System.out.println("sb = " + sb);
        System.out.println("sb.hashCode() = " + sb.hashCode());





    }
}
