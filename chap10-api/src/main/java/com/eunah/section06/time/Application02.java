package main.java.com.eunah.section06.time;

import java.time.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */

        /* 필기.
         *  time 패지는 JDK 1.8에서 추가된 기능이다.
         *  Date, Calendar가 가지고 있는 단점을 해소하기 위해서 탄생되었다.
         *  time 패키지의 하위 패키지
         *  java.time
         *   ㄴjava.time.chrono : ISO-8601(국제표준)에 정의된 달력 시스템을 위한 클래스들을 제공한다.
         *   ㄴjava.time.format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
         *   ㄴjava.time.temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
         *   ㄴjava.time.zone : 시간대에 관련된 기능 제공
         *
         *   잘 쓰는 클래스 들로는
         *   LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스들이 있다.
         * */

        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(18, 30, 0);

        System.out.println("timeNow : " + timeNow);
        System.out.println("timeOf : " + timeOf);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2023, 1, 19);

        System.out.println("dateNow : " + dateNow);
        System.out.println("dateOf : " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);

        System.out.println("dateTimeNow : " + dateTimeNow);
        System.out.println("dateTimeOf : " + dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));

        System.out.println("zonedDateTimeNow : " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf : " + zonedDateTimeOf);
    }
}
