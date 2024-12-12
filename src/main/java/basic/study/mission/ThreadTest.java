package basic.study.mission;

import java.text.SimpleDateFormat;

import static basic.study.mission.ThreadTest.format;

public class ThreadTest {
    final static SimpleDateFormat format = new SimpleDateFormat("hh:mm:sss:SSS");


    public static void main(String[] args) {

        makeThreads();

    }

    static void makeThreads()  {

        for (int i = 1; i <= 10; i++) {
            Thread thread = new ThreadClass(i);
            thread.start();
            // run() 하면 하나씩 실행해서 기다림
            // start() 하니 동시에 하긴하는데 4064개 부터 OutOfMemory ㅠㅠ
        }
        System.out.println("============== makeTreads 종료 ==============");
    }
}

class ThreadClass extends Thread {
    static int count = 0;
    long start;
    ThreadClass(int i) {
        super.setName("thread"+ i);
        System.out.println(this.getName() + " 생성 : " + format.format(System.currentTimeMillis()));
    }

    void increCnt() {
        count++;
    }

    @Override
    public void run() {
        try {
            increCnt();
            start = System.currentTimeMillis();
            System.out.println(this.getName() + " : " + this.getState() + " : " + format.format(start) + " __ " + count);
            Thread.sleep(1000*30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 안됨...
        try {
            this.join();
            System.out.println(this.getName() + this.isAlive());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
