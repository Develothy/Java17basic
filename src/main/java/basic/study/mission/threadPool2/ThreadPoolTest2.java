package basic.study.mission.threadPool2;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import static basic.study.mission.threadPool2.ThreadPoolTest2.format;

public class ThreadPoolTest2 {

    final static SimpleDateFormat format = new SimpleDateFormat("hh:mm:sss:SSS");

    static int count = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(100); // 최대 10개 Thread를 동시에 실행

        for (int i = 0; i < 100000; i++) {
            executor.execute(new TestThread(i));
        }
        executor.shutdown();
    }
    /*
     * ThreadFactory
    public static void main(String[] args) {

        // 새로운 쓰레드 추가시 로그 출력 ThreadFactory
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                System.out.println("new ThreadFactory() Runnable ["+ count++ +"] is created. [[ " + thread.getState() + " ]]");
                return thread;
            }
        };

        // 쓰레드 n개를 만드는 쓰레드풀 생성
        ExecutorService p = Executors.newFixedThreadPool(10, threadFactory);
        //ExecutorService p = Executors.newCachedThreadPool(threadFactory); // 4073개 out of memory ㅠ
        //ExecutorService p = Executors.newScheduledThreadPool(10, threadFactory);

        // TEST
        try {
            // item을 쓰레드풀에 담고 실행
            for(int i = 0 ; i < 100000; i++){
                Runnable r = new TestRunnable(i);
                p.submit(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        p.shutdown();
    }*/
}

class TestThread extends Thread {
    String name;

    TestThread (int i) {
        name = "Thread" + i;
        System.out.println(name + "생성!");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000 * 3);
            System.out.println("========= Run!! " + name + " : " + format.format(System.currentTimeMillis()) +" =========");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TestRunnable implements Runnable{

    String name;
    public TestRunnable(int i) {
        name = "Thread" + i;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000 * 3);
            System.out.println("========= Run!! " + name + " : " + format.format(System.currentTimeMillis()) +" =========");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}