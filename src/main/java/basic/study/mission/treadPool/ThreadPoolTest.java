package basic.study.mission.treadPool;

import java.text.SimpleDateFormat;

import static basic.study.mission.treadPool.ThreadPoolTest.format;

public class ThreadPoolTest {
    final static SimpleDateFormat format = new SimpleDateFormat("hh:mm:sss:SSS");

    public static void main(String[] args) {
        makeThreadPool();
    }

    static void makeThreadPool() {
        ThreadPool threadPool = new ThreadPool(100, 100);

        threadPool.toggleDebugWithQueue(true);  // item 큐 디버깅 on
        threadPool.toggleDebugWithRunnable(true); // thread 디버깅 on

/*        try {
            // item을 threadPool에 삽입 및 실행
            for (int i = 0; i <= 100000; i++) {
                Runnable r = new ThreadTest3(i);
                threadPool.excute(r);
            }
        } catch (Exception e) {
            System.out.println(e);
        } */

        try {
            // item을 threadPool에 삽입 및 실행
            for (int i = 0; i <= 100000; i++) {
                Thread t = new ThreadTest2(i);
                threadPool.excute(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
/*        try {
            threadPool.stop();
        } catch (InterruptedException e) {
            System.out.println("threadPool is stopped");
        }*/
    }
}

class ThreadTest2 extends Thread {
    static int count = 0;
    long start;
    ThreadTest2(int i) {
        super.setName("thread " + i);
        System.out.println(this.getName() + " 생성 : " + format.format(System.currentTimeMillis()));
    }

    void increCnt() {
        count++;
    }

    @Override
    public void run() {
        try {
            start = System.currentTimeMillis();
            System.out.println(this.getName() + " : " + this.getState() + " : " + format.format(start) + " __ " + count);
            Thread.sleep(1000*3);
            System.out.println(this.getName() + " : sleep 종료 : " + format.format(System.currentTimeMillis()) + " __ " + count);
            increCnt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTest3 implements Runnable {
    String name;
    public ThreadTest3(int i) {
        this.name = "thread " + i;
    }

    @Override
    public void run() {
        try {
            System.out.println("=========== " + name + " run!! ===========");
            Thread.sleep(1000*30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}