package main.java.com.eunah.section01.run;

import main.java.com.eunah.section01.Bunny;
import main.java.com.eunah.section01.DrunkenBunny;
import main.java.com.eunah.section01.Rabbit;
import main.java.com.eunah.section01.RabbitFarm;

public class Application01 {
    public static void main(String[] args) {

            // extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.

            // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

            RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
            RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
            RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

            // setter 를 이용할 때도 올바른 타입의 인스턴스를 전달해야 한다.
            farm4.setAnimal(new Rabbit());
            farm4.getAnimal().cry();

            farm5.setAnimal(new Bunny());
            farm5.getAnimal().cry();

            farm6.setAnimal(new DrunkenBunny());
            farm6.getAnimal().cry();

        }
    }