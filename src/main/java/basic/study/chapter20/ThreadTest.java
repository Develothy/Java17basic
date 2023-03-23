package basic.study.chapter20;

public class ThreadTest {

    public static void main(String[] args) {

        PrintThread worker = new PrintThread();
        worker.start();

        for (int num = 0; num < 30; num++) {
            System.out.print("O");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
class PrintThread extends Thread {
    public void run() {
        for (int num = 0; num < 30; num++) {
            System.out.print("X");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
