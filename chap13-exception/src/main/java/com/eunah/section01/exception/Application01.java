package main.java.com.eunah.section01.exception;

public class Application01 {
    public static void main(String[] args) throws Exception {






        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(5000,10000);
        et.checkEnoughMoney(10000,5000);






    }
}
