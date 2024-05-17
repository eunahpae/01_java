package main.java.com.eunah.section02.encapsulation.problem3;

public class Application01 {
    public static void main(String[] args) {

        // 몬스터 객체를 여러 개 생성한다.
        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(100);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());


        Monster monster4 = new Monster();
        monster4.kinds="뿌꾸";
        monster4.hp = 500;


    }
}
