package main.java.com.eunah.section04.use2;

public class Dicer {

    private int currentPosition;

    public void throwDice(Dice dice) {

        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println(currentPosition + " 만큼 이동하셨습니다.");
    }

    public void move(int diceNumber) {

        this.currentPosition += diceNumber;

    }

}
