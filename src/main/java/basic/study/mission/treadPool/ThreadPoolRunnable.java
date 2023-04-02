package basic.study.mission.treadPool;

public class ThreadPoolRunnable implements Runnable {
    /*
     * ThreadPoolQueue의 실제 task처리 클래스
     */

    private int id;
    private ThreadPoolQueue queue;
    private volatile boolean running = true;    // 변수의 원자성 보장(synchronized 변수버전)
    private boolean DEBUG = false;

    // Runnable 초기화
    public ThreadPoolRunnable(int threadId, ThreadPoolQueue queue) {
        this.id = threadId;
        this.queue = queue;
        System.out.println("ThreadPoolRunnable " + id + " is created");
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(10);
                System.out.println("ThreadPoolRunnable " + id + " is working");
                Runnable r = (Runnable) queue.dequeue(); // queue 아이템 반환받음
                //Thread r = (Thread) queue.dequeue();
                r.run();
                //r.start();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                stop();
            }
        }
        System.out.println("ThreadPoolRunnable " + id + " is dead");
    }

    public void stop() {
        running = false;
        System.out.println("ThreadPoolRunnable " + id + " is stopped");
    }

    // 현재 Runnable 디버깅 설정
    public void toggleDebug(boolean flag) {
        this.DEBUG = flag;
    }

    public void consoleDebug(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        }
    }

}
