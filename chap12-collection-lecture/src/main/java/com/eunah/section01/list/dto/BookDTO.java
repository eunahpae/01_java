package main.java.com.eunah.section01.list.dto;

public class BookDTO {

    private int num;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int num, String title, String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "BookDTO{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
