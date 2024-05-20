package main.java.com.eunah.section01.polymorphism;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 다형성
         * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
         * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
         * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 될 수도 있다.
         *
         * 다형성은 객체지향 프로그래밍의 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
         * 객체지향 프로그래밍의 꽆이라고 불리울 정도로 활용성이 높고 장점이 많다.
         * 하지만 학습하기 어렵다는 단점을 가지고 있다.
         */

        /*
         * 다형성의 장점)
         *
         * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         * 이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         * (다양한 기능을 사용하는 데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
         * 하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         * 다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
         * 하지만 이 부분은 이견이 ㅁ낳이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         *
         * 3. 확장성이 좋은 코드를 작성할 수 있다.
         * 4. 결합도를 낮춰서 유지보수성을 증가 시킬 수 있다.
         *
         */

        // Animal 인스턴스 생성 후 메소드 호출
        System.out.println("========== Animal 생성");
        Animal animal = new Animal();
        animal.eat();
        animal.cry();
        animal.run();

        // Rabbit 인스턴스 생성 후 메소드 호출
        System.out.println("========== Rabbit 생성");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.cry();
        rabbit.run();

        // Tiger 인스턴스 생성 후 메소드 호출
        System.out.println("========== Tiger 생성");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.run();


        // 부모 타입으로 자식 인스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // Rabbit r = new Animal();

        // 동적 바인딩 확인
        System.out.println("====== 동적 바인딩 =====");
        animal1.eat();
        animal1.run();
        animal1.cry();

        animal2.eat();
        animal2.run();
        animal2.cry();

        // animal1.jump(); 부모타입으로 변환했기에 자식에게만 있는 기능은 불러올 수 없음
        // animal2.bite();

        System.out.println("========= 클래스 타입의 형변환 확인 ==========");

        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

        // ((Tiger)animal1).jump(); 컴파일 오류가 나진 않지만, 클래스케이스예외 발생

        // instanceof 연산자 확인
        System.out.println("---------instanceof 확인");
        System.out.println("animal1 이 Tiger 와 같은지 : " + (animal1 instanceof Tiger));
        System.out.println("animal1 이 Rabbit 과 같은지 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1 이 Animal 과 같은지 : " + (animal1 instanceof Animal));
        System.out.println("animal2 이 Tiger 와 같은지 : " + (animal2 instanceof Tiger));
        System.out.println("animal2 이 Rabbit 과 같은지 : " + (animal2 instanceof Rabbit));


        if (animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }

        // 업 캐스팅
        Animal animal3 = new Rabbit();
        Animal animal4 = (Animal) new Rabbit();

        // 다운 캐스팅
        // 부모 타입으로 올렸던 걸 다시 내릴 때 사용
        Rabbit rabbit1 = (Rabbit) new Animal();
        Rabbit rabbit2 = (Rabbit) animal4;

    }
}
