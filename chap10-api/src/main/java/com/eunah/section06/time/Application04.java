package main.java.com.eunah.section06.time;

import java.time.*;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스가 제공하는 날짜 비교 연산 메소드를 활용할 수 있다. */
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2020, 11, 11);
        LocalDateTime future = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(localDate.isAfter(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(now));
    }
}
