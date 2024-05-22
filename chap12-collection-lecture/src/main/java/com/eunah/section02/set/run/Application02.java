package main.java.com.eunah.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {

        /*
         * LinkedHashSet 클래스
         *  HashSet 이 가지는 기능을 모두 가지고 있고.
         *  추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
         *  jdk 1.4 부터 제공하고 있다.
         *
         * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("apple");
        lhset.add("banana");
        lhset.add("orange");
        lhset.add("mango");
        lhset.add("grape");

        System.out.println("lhset = " + lhset);

        // 오름차순 정렬
        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println("tset = " + tset);

    }
    
}
