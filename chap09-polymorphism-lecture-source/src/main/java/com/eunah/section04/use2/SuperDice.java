package main.java.com.eunah.section04.use2;

public class SuperDice implements Dice {

    private int min;
    private int max;

    public SuperDice() {
        this.max = 10;
        this.min = 1;
    }

    @Override
    public int getNumber() {
        return (int) (Math.random() * (max) + min);
    }
}
