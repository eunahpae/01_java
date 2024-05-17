package main.java.com.eunah.section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
         * 김경리가 사원 10명의 월급을 입금해줘야 하는 날이다.
         * 사원의 직책은 대리/과장/차장/부장이 있으며
         * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
         * 보너스는 각 월급 * 0.5 만큼을 더해서 주어야 한다.
         */

        // 화면에 출력되는 형태는 다음과 같아야 한다.
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입급되었습니다.


        int salary01 = 100;
        int salary02 = 120;
        int salary03 = 130;
        int salary04 = 150;

        double bonus = 1.5;

        System.out.println("김대리의 월급은 " + salary01 + "만원 + 보너스 " + ((int) (salary01 * bonus) - salary01) + "만원으로 총 " + (int) (salary01 * bonus) + "만원 입금되었습니다.");
        System.out.println("박과장의 월급은 " + salary02 + "만원 + 보너스 " + ((int) (salary02 * bonus) - salary01) + "만원으로 총 " + (int) (salary02 * bonus) + "만원 입금되었습니다.");
        System.out.println("강차장의 월급은 " + salary03 + "만원 + 보너스 " + ((int) (salary03 * bonus) - salary01) + "만원으로 총 " + (int) (salary03 * bonus) + "만원 입금되었습니다.");
        System.out.println("서부장의 월급은 " + salary04 + "만원 + 보너스 " + ((int) (salary04 * bonus) - salary01) + "만원으로 총 " + (int) (salary04 * bonus) + "만원 입금되었습니다.");

    }
}
