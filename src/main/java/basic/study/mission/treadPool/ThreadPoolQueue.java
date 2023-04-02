package basic.study.mission.treadPool;

import java.util.LinkedList;

public class ThreadPoolQueue {
    /*
     * Thread의 task를 삽입하고 꺼낼 큐
     */

    // item 저장할 큐
    private LinkedList<Object> queue = new LinkedList<>();

    private int MAX_QUEUE_SIZE = 10;

    private boolean DEBUG = false;

    public ThreadPoolQueue(int MAX_QUEUE_SIZE) {
        this.MAX_QUEUE_SIZE = MAX_QUEUE_SIZE;
    }

    // item 삽입
    public synchronized void enqueue(Object item) throws InterruptedException {

        // 현재 큐가 꽉차면 멈춤
        while ( queue.size() == MAX_QUEUE_SIZE ) {
            System.out.println("큐 최대...");
            wait();
        }

        // 현재 큐가 비어있으면 일하라고 노티
        if (queue.size() == 0) {
            System.out.println("enqueue notify all~!!");
        }
        System.out.println("enqueue adding " + item + this.getClass().getSimpleName());
        queue.add(item);
    }

    // item 반환
    public synchronized Object dequeue() throws InterruptedException {

        // 반환할 아이템이 없어면 멈춤
        while (queue.size() == 0) {
            System.out.println("반환할 큐 없음..wait");
            wait();
        }

        // 반환할 아이템이 가득참
        if (queue.size() == MAX_QUEUE_SIZE) {
            System.out.println("dequeue notify all~! 꽉참!");
            notifyAll();
        }

        System.out.println("dequeue removing..");
        return queue.remove(0);
    }

    public void toggleDebug(boolean flag) {
        this.DEBUG = flag;
    }

    public void consoleDebug(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        }
    }


}
