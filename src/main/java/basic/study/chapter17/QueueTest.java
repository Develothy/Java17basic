package basic.study.chapter17;

import java.util.LinkedList;

public class QueueTest {

    public static void main(String[] args) {
        queueTest();
    }

    static void queueTest() {

        // queue 인터페이스를 구현하는 클래스 중 Linked가 가장 간단..
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("호랑이"); // == addLast
        queue.offer("사자");
        queue.offer("코끼리");

        while (queue.isEmpty() == false) {
            System.out.println(queue.poll()); // == pop / 빼내기만 하고 삭제 안하면 peek
        }
    }
}
