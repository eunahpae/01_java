package main.java.com.eunah.question;

public class BookDTO {

    private String title;
    private String genre;
    private String author;
    private int price;
    private int discount;

    // 설정자 & 접근자 - 마우스오른쪽키-Grnerate || 윈도우: ALT + Insert -> Constructor / 맥: command+N -> Constructor
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // 기본생성자
    public BookDTO() {
        System.out.println("기본생성자 호출됨");
    }

    // 3개 필드 초기화하는 생성자
    public BookDTO(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    // 모든 필드 초기화하는 생성자
    public BookDTO(String title, String genre, String author, int price, int discount) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    // 정보 출력 메소드
    public String geyInfomation() {
        return "Book [title = " + this.title + ", genre = " + this.genre + ", author = " + this.author + ", price = " + this.price + ", discount = " + this.discount + "%]";
    }
}
