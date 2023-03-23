package basic.study.chapter20;

public class PriorityTest {

    public static void main(String[] args) {

        PrintThread6 worker1 = new PrintThread6();
        PrintThread7 worker2 = new PrintThread7();
        worker1.start();
        worker2.setPriority(Thread.MAX_PRIORITY);
        worker2.start();
    }
}

class PrintThread6 extends Thread {
    @Override
    public void run() {
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.cos(i);
        }
        System.out.println("cos = " + sum);
    }
}

class PrintThread7 extends Thread {
    @Override
    public void run() {
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.sin(i);
        }
        System.out.println("sin = " + sum);
    }
}