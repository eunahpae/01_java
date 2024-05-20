package main.java.com.eunah.section04.use2;

public class Application01 {
    public static void main(String[] args) {

        Dicer dicer = new Dicer();

        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());


    }
}
