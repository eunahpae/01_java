package main.java.com.eunah.section04.forquestion;

public class ForQuestion {

    public static String oddOrEven(int x) {
        return x > 0 ? x % 2 == 0 ? "양수면서 짝수입니다." : "양수면서 홀수입니다."
                : x % 2 == 0 ? "음수면서 짝수입니다." : "음수면서 홀수입니다.";
    }
}
