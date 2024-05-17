package main.java.com.eunah.question;

public class Question {
    public static void main(String[] args) {

        // BookDTO - 책 제목, 종류, 작가, 가격, 할인률
        // getter, setter, 생성자

        // 1. 기본생성자를 이용한 인스턴스 생성 후 필드 값 출력
        BookDTO book1 = new BookDTO();
        book1.setTitle("삼국지");
        book1.setGenre("역사");
        book1.setAuthor("유비");
        book1.setPrice(20000);
        book1.setDiscount(10);
        System.out.println(book1.geyInfomation());

        // 2. 필드 3가지를 초기화하는 생성자를 사용해 인스턴스 생성 후 필드 값 출력
        BookDTO book2 = new BookDTO("홍길동전", "고전문학", "홍길동");
        System.out.println(book2.geyInfomation());

        // 3. 모든 필드를 초기화하는 생성자 사용해 인스턴스 생성 후 필드 값 출력
        BookDTO book3 = new BookDTO("장군 이순신", "위인전", "이순신", 18000, 10);
        System.out.println(book3.geyInfomation());


    }
}
