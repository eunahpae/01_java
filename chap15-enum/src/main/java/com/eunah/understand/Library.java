package main.java.com.eunah.understand;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<Genre, ArrayList<Book>> bookMap; // 장르별로 도서 목록을 관리할 HashMap

    // 생성자
    public Library() {
        this.bookMap = new HashMap<>(); // bookMap 초기화
        for (Genre genre : Genre.values()) { // 모든 장르에 대해
            bookMap.put(genre, new ArrayList<>()); // 각 장르에 빈 ArrayList 를 추가
        }
    }

    // 도서 추가 메소드
    public boolean addBook(Book book) {
        for (ArrayList<Book> books : bookMap.values()) { // 향상된 for문을 ㅗ든 장르의 도서 목록 탐색
            for (Book existBook : books) { // 각 장르의 도서 목록에서 도서를 하나씩 확인
                if (existBook.getTitle().equals(book.getTitle())) { // 동일한 제목의 도서가 있는지 확인
                    System.out.println("이미 같은 제목의 도서가 존재합니다."); // 동일도서 존재시 메시지 출력
                    return false; // 도서를 추가하지 않고 false를 반환
                }
                if (existBook.getNum().equals(book.getNum())) { // 동일한 번호의 도서가 있는지 확인
                    System.out.println("이미 같은 번호의 도서가 존재합니다."); // 동일번호 존재시 메세지 출력
                    return false; // 도서를 추가하지 않고 false를 반환
                }
            }
        }

        bookMap.get(book.getGenre()).add(book); // 해당 도서의 장르에 도서를 추가
        return true; // 도서를 성공적으로 추가한 경우 true를 반환
    }

    // 특정 장르 도서 목록 출력 메소드
    public void printBooksGenre(Genre genre) {
        ArrayList<Book> books = bookMap.get(genre); // 해당 장르의 도서 목록을 가져옴
        System.out.println(genre + " 장르 도서 목록"); // 장르별 도서 목록 제목을 출력
        for (Book book : books) { // 해당 장르의 도서 목록을 순회
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getNum() + " " + book.isBorrowed()); // 각 도서의 제목, 저자, 번호, 대여 상태를 출력
        }
    }

    // 도서 대여 메소드
    public void borrowBook(String num) {
        for (ArrayList<Book> books : bookMap.values()) { // 모든 장르의 도서 목록을 탐색
            for (Book book : books) { // 각 장르의 도서 목록에서 도서를 하나씩 확인.
                if (book.getNum().equals(num)) { // 입력된 번호와 일치하는 도서를 검색
                    book.borrowBook(); // 도서 대여
                    return; // 메소드 종료
                }
            }
        }
        System.out.println("해당 " + num + " 번의 도서를 찾을 수 없습니다."); // 잘못된 메시지 출력
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
        System.out.println("해당 " + num + " 번의 도서를 찾을 수 없습니다."); // 잘못된 메시지 출력
    }
}