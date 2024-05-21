package main.java.com.eunah.section05.calendar;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application02 {
    public static void main(String[] args) {

        /* API 문서를 살펴보면 caLendar 클래스는 abstract 클래스로 작성되어 있다.
           따라서 CaLendar 클래스를 이용해서 인스턴스를 생성하는 것이 불가능하다.
           Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지가 있다.
             1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
             2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법 */


        // 1. getInstance() 메소드 이용
        Calendar calendar = Calendar.getInstance();

        /* toString() 이 오버라이딩 되어 있어 모든 필드 값을 확인할 수 있다.
           Date 클래스에 비해 매우 많은 필드들이 값을 가지고 있다.
           또한 생성된 인스턴스의 타입이 후손 클래스 타입인 GregorianCalendar 타입인 것을 확인할 수 있다.
           이 방식으로 인스턴스를 생성하면 운영체제의 날짜/시간 정보를 이용해서 인스턴스를 생성하게 된다. */
        System.out.println("calendar = " + calendar);

        // 2. 특정 날짜/시간 정보를 이용해서 인스턴스를 생성하는 방법을 GregorianCalendar(구제표준시)의 생성자로 제공한다.
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println("gregorianCalendar = " + gregorianCalendar);

        // 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성
        // 2014년 9월 8일 16:42:00
        int year = 2014;
        int month = 9;
        int dayOfMonth = 8;
        int hour = 16;
        int minute = 42;
        int second = 00;

        Calendar choiceDay = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);
        System.out.println("choiceDay = " + choiceDay);

        /*
         * 상황에 따라 특정 일자를 기준으로 한 Sate 타입의 인스턴스가 필요한 경우도 있다.
         * 먼저 GregorianCalendar 를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
         * 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond 로 계산해서 long 형으로 반환하는 메소드가 있다.
         *
         *  필기.
         *  왜 1970년 1월 1일 0시 0분 0초 인가요? * * 필기. *  수직으로 태양이 떠오르는 시간을 정오(12시)로 계산하는 방법을 태양시라고 부른다.
         *  그리치니 천문대의 천문학적 업적을 기리고자 그리치치 천문대를 기준으로 태양이 수직으로 떠오르는 시점을 *  12시로 측정한 시간대가 GMT 시간대이다.
         *  하지만 태양시는 오차가 발생할 수 있다. 태양빛이 지구까지 오는 데 걸리는 시간은 8분 12초 ~ 8분 28초 이기 때문에
         *  태양시는 실제 태양 위치와 육안으로 측정한 시간의 오차가 발생할 수 밖에 없었다.
         *  또한 지구가 23.5도 기울어져 있고 공전이 타원 궤도로 돌기 때문에 계절에 따라 조금씩 다를 수 밖에 없다.

         *  필기.
         *  이러한 시간을 측정하는 방식보다 조금 더 정밀한 측정 방법도 존재하는데
         *  매우 작은 원자가 바닥과 들뜸 상태를 주기적으로 반복하는 것을 이용하여 시간을 측정하는 방법이 있다.
         *  특히 세슘 원자의 경우 1초동안 진동하는 횟수가 실제 1초와 유사하여 30만년에 1초의 오차를 보이는 정확성을 보인다.
         *  따라서 세계적으로 동일한 시간대를 사용하기 위해 협정한 시간을 협정 세계시 UTC 라고 한다.

         *  필기.
         *  하지만 물리적으로 너무 정확하다보니 실제 존재하는 지구와 태양간의 공전/자전에 따른 오차를 반영해야 한다.
         *  그래서 윤초를 두고 세슘 원자 시계와 태양시의 오차를 보정하는데 사용한다.
         *  이것이 정해진 날짜는 1972년 1월 1일이며, 세계 표준시를 기준으로 1972년으로 계산하기에는 뭔가 딱 맞아 떨어지지 않아
         *  1970년 1월 1일 0시 0분 0초를 기준으로 컴퓨터에서는 시간대를 계산하기로 한 것이다. */

        System.out.println("choiceDay.getTimeInMillis() = " + choiceDay.getTimeInMillis());
        Date date = new Date(choiceDay.getTimeInMillis());
        System.out.println("date = " + date);

        // 실제 사용시 형태
        Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, minute, second).getTimeInMillis());
        System.out.println("date2 = " + date2);

        // 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환 받을 수 있다.
        int choiceYear = choiceDay.get(1);
        int choiceMonth = choiceDay.get(2);
        int choiceDayOfMonth = choiceDay.get(5);

        System.out.println("choiceYear = " + choiceYear);
        System.out.println("choiceMonth = " + choiceMonth);
        System.out.println("choiceDayOfMonth = " + choiceDayOfMonth);

        /* 인자로 전달하는 정수에 따라 필드 값을 반환 받을 수 있지만
           각 필드에 매칭되는 매개변수의 위치 정수를 다 외워야 사용이 가능해지기 때문에
           상수 필드 형태로 제공을 하고 있다. */

        System.out.println(choiceDay.get(Calendar.YEAR));
        System.out.println(choiceDay.get(Calendar.MONTH));
        System.out.println(choiceDay.get(Calendar.DATE));
        System.out.println(choiceDay.get(Calendar.DAY_OF_WEEK));
        System.out.println(choiceDay.get(Calendar.AM_PM));
        System.out.println(choiceDay.get(Calendar.HOUR_OF_DAY)); // 24
        System.out.println(choiceDay.get(Calendar.HOUR)); //12

    }
}
