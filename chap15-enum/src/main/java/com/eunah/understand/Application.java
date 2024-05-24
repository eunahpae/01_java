package main.java.com.eunah.understand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scr = new Scanner(System.in);


        while (true) {
            System.out.println("===================================");
            System.out.println("도서 관리 시스템");
            System.out.println("1. 도서 추가");
            System.out.println("2. 장르별 도서 목록 보기");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("5. 종료");
            System.out.println("옵션을 선택 해주세요");

            int choice = 0;

            try {
                choice = scr.nextInt();
                scr.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("도서 제목을 입력 해주세요");
                        String title = scr.nextLine();
                        System.out.println("도서 저자를 입력 해주세요");
                        String author = scr.nextLine();
                        System.out.println("도서 등록 번호를 입력 해주세요");
                        int number = scr.nextInt();
                        scr.nextLine();
                        String num = number + "";
                        Genre genre = null;
                        do {
                            try {
                                System.out.println("장르를 입력 해주세요 (FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY)");
                                String genStr = scr.nextLine();
                                genre = Genre.valueOf(genStr.toUpperCase());
                            } catch (IllegalArgumentException e) {
                                System.out.println("올바르지 않은 장르입니다. 다시 입력 해주세요");
                            }

                        } while (genre == null);

                        boolean isTrue = library.addBook(new Book(title, author, num, genre));
                        if (isTrue) {
                            System.out.println("도서가 성공적으로 등록되었습니다.");
                        } else {
                            System.out.println("이미 존재하는 번호 혹은 제목입니다.");
                        }
                        break;
                    case 2:
                        System.out.println("보고 싶은 목록의 장르를 입력 하세요 (FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY)");
                        Genre genre1 = null;
                        do {
                            try {
                                String geneStr = scr.nextLine();
                                genre1 = Genre.valueOf(geneStr.toUpperCase());
                            } catch (IllegalArgumentException e) {
                                System.out.println("올바르지 않은 장르입니다.");
                            }
                        } while (genre1 == null);
                        library.printBooksGenre(genre1);
                        break;
                    case 3:
                        System.out.println("대여할 도서의 번호를 입력 해주세요");
                        int number1 = scr.nextInt();
                        scr.nextLine();
                        String num1 = number1 + "";
                        library.borrowBook(num1);
                        break;
                    case 4:
                        System.out.println("반납할 도서의 번호를 입력 해주세요");
                        int number2 = scr.nextInt();
                        scr.nextLine();
                        String num2 = number2 + "";
                        library.returnBook(num2);
                        break;
                    case 5:
                        System.out.println("시스템을 종료합니다.");
                        return;
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