package basic.study.chapter17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        //stackTest();
        dequeTest();
    }


    static void stackTest() {
        Stack<String> zooStack = new Stack<>();
        zooStack.push("호랑이");
        zooStack.push("사자");
        zooStack.push("코끼리");

        while (zooStack.empty() == false) {
            System.out.println(zooStack.pop());
        }
    }

    static void dequeTest() {
        Deque<String> zooStack = new ArrayDeque<>();
        zooStack.push("호랑이");
        zooStack.addFirst("사자"); // == push
        zooStack.push("코끼리");

        while (zooStack.isEmpty() == false) {
            System.out.println(zooStack.removeLast());  // == pop
        }

    }

}
