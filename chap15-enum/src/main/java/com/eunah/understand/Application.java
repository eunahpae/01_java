package main.java.com.eunah.understand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Library library = new Library(); // Library 클래스의 인스턴스 생성
        Scanner scr = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성


        while (true) { // 무한 루프 시작
            System.out.println("===================================");
            System.out.println("도서 관리 시스템");
            System.out.println("1. 도서 추가");
            System.out.println("2. 장르별 도서 목록 보기");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("5. 종료");
            System.out.println("옵션을 선택 해주세요");

            int choice = 0; // 사용자가 선택한 옵션을 저장할 변수 초기화

            try {
                choice = scr.nextInt(); // 사용자가 입력한 정수 저장
                scr.nextLine(); // 개행 문자 제거

                switch (choice) { // 선택한 옵션에 따른 각 케이스 구문
                    case 1:
                        System.out.println("도서 제목을 입력 해주세요");
                        String title = scr.nextLine();
                        System.out.println("도서 저자를 입력 해주세요");
                        String author = scr.nextLine();
                        System.out.println("도서 등록 번호를 입력 해주세요");
                        int number = scr.nextInt();
                        scr.nextLine();

                        String num = number + ""; // 도서 등록 번호를 문자열로 변환
                        Genre genre = null; // 장르 변수 초기화
                        do {
                            try {
                                System.out.println("장르를 입력 해주세요 (FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY)");
                                String genStr = scr.nextLine();
                                genre = Genre.valueOf(genStr.toUpperCase()); // 입력된 문자열을 대문자로 변환하여 Genre 열거형으로 변환
                            } catch (IllegalArgumentException e) {
                                System.out.println("올바르지 않은 장르입니다. 다시 입력 해주세요"); // 잘못된 장르가 입력되었을 경우 메시지 출력
                            }
                        } while (genre == null); // 올바른 장르가 입력될 때까지 반복

                        boolean isTrue = library.addBook(new Book(title, author, num, genre)); // 입력된 정보를 바탕으로 새로운 도서를 추가
                        if (isTrue) {
                            System.out.println("도서가 성공적으로 등록되었습니다.");
                        } else {
                            System.out.println("이미 존재하는 번호 혹은 제목입니다.");
                        }
                        break;
                    case 2:
                        System.out.println("보고 싶은 목록의 장르를 입력 하세요 (FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY)"); // 장르 입력 요청
                        Genre genre1 = null; // 장르 변수를 초기화
                        do {
                            try {
                                String geneStr = scr.nextLine();
                                genre1 = Genre.valueOf(geneStr.toUpperCase()); // 입력된 문자열을 대문자로 변환하여 Genre 열거형으로 변환
                            } catch (IllegalArgumentException e) {
                                System.out.println("올바르지 않은 장르입니다."); // 잘못된 장르가 입력되었을 경우 메시지를 출력
                            }
                        } while (genre1 == null); // 올바른 장르가 입력될 때까지 반복
                        library.printBooksGenre(genre1); // 해당 장르의 도서 목록을 출력
                        break;
                    case 3:
                        System.out.println("대여할 도서의 번호를 입력 해주세요"); // 대여할 도서의 번호 입력 요청
                        int number1 = scr.nextInt(); // 사용자가 입력한 도서 번호 저장
                        scr.nextLine(); // 개행 문자 제거
                        String num1 = number1 + ""; // 도서 번호를 문자열로 변환
                        library.borrowBook(num1); // 도서 대여
                        break;
                    case 4:
                        System.out.println("반납할 도서의 번호를 입력 해주세요");
                        int number2 = scr.nextInt();
                        scr.nextLine();
                        String num2 = number2 + "";
                        library.returnBook(num2); // 도서 반납
                        break;
                    case 5:
                        System.out.println("시스템을 종료합니다.");
                        return; // 프로그램 종료
                    default:
                        System.out.println("잘못 선택하셨습니다.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력 해주세요");
                scr.nextLine();
            }
        }
    }
}