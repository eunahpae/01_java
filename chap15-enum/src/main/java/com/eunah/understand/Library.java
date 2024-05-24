package main.java.com.eunah.understand;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<Genre, ArrayList<Book>> bookMap;

    // 생성자
    public Library() {
        this.bookMap = new HashMap<>();
        for (Genre genre : Genre.values()) {
            bookMap.put(genre, new ArrayList<>());
        }
    }

    // 도서 추가 메소드
    public boolean addBook(Book book) {
        for (ArrayList<Book> books : bookMap.values()) {
            for (Book existBook : books) {
                if (existBook.getTitle().equals(book.getTitle())) {
                    System.out.println("이미 같은 제목의 도서가 존재합니다.");
                    return false;
                }
                if (existBook.getNum().equals(book.getNum())) {
                    System.out.println("이미 같은 번호의 도서가 존재합니다.");
                    return false;
                }
            }
        }

        bookMap.get(book.getGenre()).add(book);
        return true;
    }

    // 특정 장르 도서 목록 출력 메소드
    public void printBooksGenre(Genre genre) {
        ArrayList<Book> books = bookMap.get(genre);
        System.out.println(genre + " 장르 도서 목록");
        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getNum() + " " + book.isBorrowed());
        }

    }


    // 도서 대여 메소드
    public void borrowBook(String num) {
        for (ArrayList<Book> books : bookMap.values()) {
            for (Book book : books) {
                if (book.getNum().equals(num)) {
                    book.borrowBook();
                    return;
                }
            }
        }
        System.out.println("해당 " + num + " 번의 도서를 찾을 수 없습니다.");
    }

    // 도서 반납 메소드
    public void returnBook(String num) {
        for (ArrayList<Book> books : bookMap.values()) {
            for (Book book : books) {
                if (book.getNum().equals(num)) {
                    book.returnBook();
                    return;
                }
            }
        }
        System.out.println("해당 " + num + " 번의 도서를 찾을 수 없습니다.");

    }


}