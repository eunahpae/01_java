package main.java.com.eunah.section01.exception;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(10000,5000);
            System.out.println("========== 상품 구입 가능 ==========");

        } catch (Exception e) {
            e.printStackTrace(); // 에러메세지를 띄우겠다!
        }

        System.out.println("프로그램 종료");
    }

}
