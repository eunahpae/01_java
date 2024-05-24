package main.java.com.eunah.section03;

public enum UserRole2 {

    GUEST("게스트"), CONSUMER("구매자"), PRODUCER("판매자"), ADMIN("관리자");

    // Field 생성  - 필요시 내용을 넣어 해당 내용을 활용할 수 있음
    private String description;

    UserRole2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
