package main.java.com.eunah.section02;


import main.java.com.eunah.section02.exception.MoneyNegativeException;
import main.java.com.eunah.section02.exception.NotEnoughMonetException;
import main.java.com.eunah.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();


        try {
            et.checkEnoughMoney(1000, -5000);
        } catch (NotEnoughMonetException e) {
            e.printStackTrace();
        } catch (PriceNegativeException | MoneyNegativeException e) {
            e.printStackTrace();

        } finally {
            System.out.println("무조건 마지막에 동작");
        }
    }
}

