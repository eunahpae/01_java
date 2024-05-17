package main.java.com.eunah.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        // 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.

        String[] names = {"홍길동", "유관순", "이순신"};
        System.out.println("name의 hashcode : " + names.hashCode());
        print(names);

        String[] animals = getAnimals();
        System.out.println("animals의 hashcode : " + animals.hashCode());

        print(animals); // animals의 리턴값을 print 메소드로 넘겨줘서 해당 주소값이 출력됨

    }

    public static void print(String[] names) {
        System.out.println("names의 hashcode : " + names.hashCode());
    }

    public static String[] getAnimals() {
        String[] animals = {"낙타", "호랑이", "돼지"};
        System.out.println("animals의 hashcode : " + animals.hashCode());
        return animals;
    }

}
