package main.java.com.eunah.section01.list.run;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Application05 {
    public static void main(String[] args) {


        // Queue<String> queue = new Queue<String>() {

        Queue<String> queue = new LinkedList<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println(queue);

        /*
         * peek() : 해당 큐의 가장 앞에 있는 요소를 반환
         * poll() : 해당 큐의 가장 앞에 있는 요소 반환 후 제거
         */

        System.out.println("queue.peek() : " + queue.peek());
        System.out.println(queue);

        System.out.println("queue.poll() : " + queue.poll());
        System.out.println(queue);
    }
}
