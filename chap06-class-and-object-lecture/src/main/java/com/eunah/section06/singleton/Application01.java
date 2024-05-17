package main.java.com.eunah.section06.singleton;

public class Application01 {
    public static void main(String[] args) {

        /* singleton pattern 이란?
           애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고
           그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하여
           메모리 낭비를 방지할 수 있게 함(매번 인스턴스를 생성하지 않음)

            장점)
            1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
               두 번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다.
            2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.

            단점)
            1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
               (유지보수와 테스트에 문제점이 있음)
            2. 동시성 문제를 고려해서 설계해야하기 때문에 난이도가 있다. */


        /* 싱글톤 구현 방법
            1. 이른 초기화(Eager Initialization)
            2. 게으론 초기화(Lazy Initialization) */

        // 1. 이른초기화 구현
        // EagerSingleton eager1 = new EagerSingleton();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1 의 hashCode : " + eager1.hashCode());
        System.out.println("eager2 의 hashCode : " + eager2.hashCode());

        // 게으른초기화 구현
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1 의 hashCode : " + lazy1.hashCode());
        System.out.println("lazy2 의 hashCode : " + lazy2.hashCode());

        /* 두 초기화의 차이점)
            1. 이른 초기화 : 이른초기화를 사용하면 클래스를 로듣하는 속도가 느려지지만,
               처음 인스턴스 반환 요청에서 속도가 빠르다는 장점을 가진다.
            2. 게으른 초기화 : 반면 게으른 초기화는 클래스를 로드하는 속도는 빠르지만,
               첫 번째 요청에 대한 속도가 두 번째 요청에 대한 속도보다 느리다는 특징을 가지고 있다.
               동시성을 고려한 다영한 싱글톤 구현 방식은 많지만,
               난이도가 매우 높으므로 여기까지만 다루고 싱글톤 개념을 이해하도록 한다. */


    }
}
