package main.java.com.eunah.section01.list.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application03 {
    public static void main(String[] args) {

        /*
         * LinkedList
         *  ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
         *  내부는 이중 연결 리스트로 구현되어 있다.
         */

        /*
         *  이중 연결 리스트?
         *  : 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도
         *    링크하여 이전 요소로 접근하기 쉽게 고안된 자료구조 이다.
         *
         *  LinkedList 는 이중 연결 리스트를 구현한 것이며 역시 List 인터페이스를
         *  상속받아서 ArrayList 와 사용하는 방법이 거의 유사하다.
         *  하지만 내부적으로 요소를 저장하는 방법에 차이가 있는 것이다.
         *  각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적합한 자료구조를
         *  구현한 클래스를 선택하는것이 좋다.
         *
         */

        // 인스턴스 생성

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(1);

        for (String s : linkedList) {
            System.out.println(s);
        }

        linkedList.set(0,"fineapple");
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList.isEmpty());


    }
}
