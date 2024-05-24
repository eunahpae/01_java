package main.java.com.eunah.understand;

public class Book {

    private String title;
    private String author;
    private String num;
    private Genre genre;
    private boolean isBorrowed;

    public Book(String title, String author, String num, Genre genre) {
        this.title = title;
        this.author = author;
        this.num = num;
        this.genre = genre;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }


    public void borrowBook() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            System.out.println(title + "이(가) 대여되었습니다.");
        } else {
            System.out.println(title + "은(는) 이미 대여 중입니다.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println(title + "이(가) 반납되었습니다.");
        } else {
            System.out.println(title + "은(는) 대여되지 않았습니다.");
        }
    }
}