package main.java.com.eunah.section05.calendar;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /* Date 클래스
           JdK 1.0 부터 날짜를 취급하기 위해 사용되던 date 클래스는
           생성자를 비롯하여 대부분의 메소드가 deprecated 되어 있다.

           Deprecated?
           향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미이다.
           하지만 하위 버전의 호환성 때문에 한 번에 제거되는 것은 아니고 남겨두었기 때문에 사용하는 것이 가능하다.

           Jdk 1.1 부터는 새롭게 제공되는 calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다.
           하지만 calendar 클래스는 몇 가지 문제를 가지고 있다.
                1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
                2. 윤초(leep second) 는 고려하지 않는다.
                     윤초란? 협정 세계시에서 사용하는 세슘 원자 시계와 실제 지구의 자전/ 공전 속도를 기준으로 한 태양시의 차이로 인해
                            발생한 오차를 보정하기 위해 추가하는 1초 이다.
                            12월 31일 마지막에 추가하거나 혹은 6월 30일의 마지막에 추가된다.
                            윤초는 사소해 보이지만 실제 2012년 링크드인 과 같은 대규모 서비스의 서버를 마비시킨 버그를 발생시킨 적도 있다.
                3. Calendar 클래스는 월을 0부터 11까지 표현하는 불편함이 있다.
                
                Jdk 8 부터는 이러한 문제를 해결할 수 있는 time 패키지를 제공하고 있다. 
           */
        
        Date today = new Date();
        System.out.println("today = " + today);
        System.out.println("today.getTime() = " + today.getTime());
        Date time = new Date(1716270866979L);
        System.out.println("time = " + time);

    }
}
