package main.java.com.eunah.section01.method;

public class Application04 {
    public static void main(String[] args) {

        /*
           여러 개의 전달인자를 이용한 메소드 호출 테스트
         */

        Application04 app4 = new Application04();
        app4.testMethod("홍길동", 20, '남');
        // app4.testMethod(20,"홍길동",'남'); 순서가 맞지 않아 오류

        // 변수에 저장된 값을 전달하여 호출할 수 있다.
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);

    }

    // 아래처럼 주석을 달면(/** */, 해당 메소드를 호출할때 아래 내용을 확인할 수 있다.

    /**
     * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공
     *
     * @param name   출력할 이름을 전달 해주세요.
     * @param age    출력할 나이를 전달 해주세요.
     * @param gender 출력할 성별을 전달 해주세요. 성별은 변경되지 않습니다.
     */

    public void testMethod(String name, int age, final char gender) {
        /* name = "홍길동";
        age = 18;
        gender = 's';  final 이 붙은 상수는 값을 재할당 할 수 없음 */

        System.out.println("당신은 " + name + "이고, " + "나이는 " + age + "세 " + gender + " 입니다.");

    }

}
