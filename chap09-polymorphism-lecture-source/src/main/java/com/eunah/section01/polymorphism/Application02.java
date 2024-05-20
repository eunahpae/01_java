package main.java.com.eunah.section01.polymorphism;

public class Application02 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }


        /*각 클래스별 고유한 메소드를 동작시키기 위해서는 down-casting  을 명시적으로 해주어야 하는데, ClassCaseException을 방지하기 위해서 instanceof 연산자를 이용해야 한다. */

        for (Animal animal : animals) {
            if (animal instanceof Rabbit) {
                ((Rabbit) animal).jump();
            } else {
                ((Tiger) animal).bite();
            }

        }


    }

}
