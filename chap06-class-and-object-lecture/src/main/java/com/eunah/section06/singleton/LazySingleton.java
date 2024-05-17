package main.java.com.eunah.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazy == null) {
            System.out.println("lazy가 null인 상태");
            lazy = new LazySingleton();
            System.out.println("생성 되었습니다.");
            return lazy;
        } else {
            System.out.println("lazy가 null이 아닌 상태");
            return lazy;
        }
    }
}
