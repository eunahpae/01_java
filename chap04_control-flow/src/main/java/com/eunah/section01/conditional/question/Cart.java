package main.java.com.eunah.section01.conditional.question;

import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.cart();

    }

    /*
     * 장바구니에 담긴 제품을 결제하는 프로그램
     *
     * 1. 장바구니의 제한은 없다.
     * 2. 결제 확인을 받으면 진행함.
     */

    public void cart() {

        // 1. 장바구니에 담긴 제품의 가격을 합산하여 관리하는 변수가 필요함
        // 카트에 담긴 제품의 가격을 입력받기 위한 변수
        int result = 0;

        // 결제 여부를 판단하기 위한 변수
        boolean payments = false;

        // 3. 사용자에게 입력받을 수 있도록 함.
        Scanner sc = new Scanner(System.in);

        // 2. 사용자한테 어느 제품을 주문할 것인지 물어봄
        // 사용자가 결제를 진행하면 반복하지 않기 위해서 조건식에 결제 여부를 입력함
        for (; !payments; ) {
            System.out.print("어느 제품을 구매하시겠습니까? : ");

            // 어떤 제품을 잘바구니에 담는지 확인하기 위한 변수
            String product = sc.nextLine();

            // 사용자가 고른 제품이 존재한다면 result 라는 변수에 가격을 추가함
            switch (product) {
                case "바나나":
                    result += 4500;
                    break;
                case "사과":
                    result += 10000;
                    break;
                case "레몬사탕":
                    result += 16000;
                    break;
                default:
                    System.out.println("존재하지 않는 제품입니다.");
                    break;
            }

            // 3. 결제 여부를 물어보고 결제를 진행함
            System.out.println("결제하시겠습니까?");
            // 결제 여부의 데이터는 boolean 타입으로 true or false 로 입력 받음
            payments = sc.nextBoolean();

            // 만약 결제 여부를 판단하는 변수인 payments 가 true 하면 결제를 진행함.
            if (payments) {
                System.out.println("결제할 금액은 총 " + result + "원입니다.");
            }

            sc.nextLine();
        }


    }
}
