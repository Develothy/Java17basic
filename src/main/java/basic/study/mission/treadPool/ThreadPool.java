package basic.study.mission.treadPool;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

    /*
     * ThreadPoolQueue, ThreadPoolRunnable을 멤버로 하는 ThreadPool 객체
     */

    private ThreadPoolQueue queue;
    private List<ThreadPoolRunnable> runnableList = new ArrayList<>();
    private volatile boolean running = true;

    // ThreadPool 초기화
    public ThreadPool(int maxThread, int maxQueueSize) {
        queue = new ThreadPoolQueue(maxQueueSize);
        for (int i = 0; i < maxQueueSize; i++) {
            runnableList.add(new ThreadPoolRunnable(i, queue));
        }
        for (ThreadPoolRunnable r : runnableList) {
            new Thread(r).start(); // runnable을 Thread 객체로 생성, 대기상태로 시작
        }
    }

    // ThreadPool 실행
    public synchronized void excute(Runnable item) throws Exception {
        if (!running) {
            throw new Exception("Thread Pool is not running");
        }
        queue.enqueue(item);
    }

    // ThreadPool 정지
    public synchronized void stop() throws InterruptedException {
        running = false;
        for (ThreadPoolRunnable r : runnableList) {
            r.stop();
        }
    }

    // Runnable console 디버깅 플래그 설정
    public void toggleDebugWithRunnable(boolean flag) {
        for (ThreadPoolRunnable r : runnableList) {
            r.toggleDebug(flag);
        }
    }

    // Queue console 디버깅 플래그 설정
    public void toggleDebugWithQueue(boolean flag) {
        queue.toggleDebug(flag);
    }
}
