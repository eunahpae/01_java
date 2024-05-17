package main.java.com.eunah.section01.method;

public class Calculator {

    // 둘 중 최소값을 리턴

    public int minNumber(int first, int second) {
        return (first > second) ? second : first;
    }


    // 둘 중 최대값을 리턴

    public static int maxNumber(int first, int second) {
        return (first > second) ? first : second;
    }
}
