package main.java.com.eunah.section03;

public enum UserRole1 {

    GUEST, CONSUMER, PRODUCER, ADMIN;

    // 생성자를 가질 수 있는데 외부에서 호출할 수 없음
    UserRole1() {
    }

    public String getNameToLowerCase() {
        return this.name().toLowerCase();
    }
}
