package main.java.com.eunah.section03.dto;

public class MemberDTO {

    // 회원 번호, 회원명, 나이, 성별, 키, 몸무게, 활성화 여부(true/false)

    // 계층간의 데이터 전송을 위해 사용되는 객체이다.

    private int number;

    private String name;

    private int age;

    private char gender;

    private double weight;

    private boolean isActivated;

    /* 설정자(setter) /  접근자(getter) 의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.

       설정자(setter)
       : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고 호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.

       접근자(getter)
       : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
       각 접근자는 하나의 필드에만 접근하도록 한다.
       필드에 접근해서 기록된 값을 return 을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다. */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

}
