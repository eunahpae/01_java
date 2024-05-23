package main.java.com.eunah.section02;

import main.java.com.eunah.section02.exception.MoneyNegativeException;
import main.java.com.eunah.section02.exception.NotEnoughMonetException;
import main.java.com.eunah.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMonetException {

        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

        if (price < 0) {
            throw new PriceNegativeException("상품가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMonetException("가진 돈보다 상품가격이 더 비쌉니다.");
        }

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑하세요.");
    }
}
