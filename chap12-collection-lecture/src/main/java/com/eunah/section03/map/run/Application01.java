package main.java.com.eunah.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
         * Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         * 키 와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         *  키(Key)란?
         *  값(value)을 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *   1. 요소의 저장 순서를 유지하지 않는다.
         *   2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장 가능하다.
         *
         *
         *  HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *  HashMap 이 가장 많이 사용되며, HashTable은 jdk1.0 부터 제공되며
         *  HashMap 과 동일하게 작동된다. 하위 호환을 위해 남겨 놓았기 때문에
         *  가급적이면 HashMap을 사용하는 것이 좋다.
         */

        HashMap hmap = new HashMap();
        // Map hmap2 = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println(hmap);

        hmap.put(12, "yellow");
        System.out.println(hmap); // 키가 중복이 안되어 해당 키의 값이 덮어씌워짐

        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println(hmap);

        System.out.println(hmap.get("one"));

        hmap.remove(9);
        System.out.println(hmap);

        System.out.println(hmap.size());


        // 받을 키,값의 자료형 지정
        HashMap<String, String> hmap2 = new HashMap<>(); // 키랑 밸류 둘다 문자열만 받을 수 있음

        hmap2.put("one", "java 8");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        System.out.println(hmap2);


        // iterator (인덱스가 없는 경우 반복문을 사용하기 위한 인터페이스)
        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " : " + value);
        }


        // value 객체들만 values() 메소드로 Collection 으로 만듦
        Collection<String> values = hmap2.values();

        // Iterator()
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            String value = valueIter.next();
            System.out.println(value);
        }

        // 배열로 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        // Map 의 내부클래스인 EntrySet 이용
        Set<Map.Entry<String, String>> entrySet = hmap2.entrySet();
        // Entry :  키 객체와 값 객체를 쌍으로 묶은 것
        Iterator<Map.Entry<String, String>> entrySetIter = entrySet.iterator();
        while (entrySetIter.hasNext()) {
            Map.Entry<String, String> entry = entrySetIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
