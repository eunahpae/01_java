package main.java.com.eunah.section01.array;

public class Application05 {
    public static void main(String[] args) {

        // 랜덤한 트럼프카드 뽑기

        // 트럼프 카드의 모양과 숫자를 배열로 정의
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // 랜덤한 모양과 숫자를 선택하기 위한 변수들 선언
        int shapesNumber = (int) (Math.random() * shapes.length); // 랜덤한 모양의 인덱스
        int chNumber = (int) (Math.random() * number.length); // 랜덤한 숫자의 인덱스

        // 선택된 트럼프 카드의 모양과 숫자를 출력
        System.out.println(shapes[shapesNumber] + " " + number[chNumber]);

    }
}
