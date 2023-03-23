package basic.study.chapter20;

public class RunnableTest {

    public static void main(String[] args) {

        PrintRunnable print = new PrintRunnable();
        Thread worker = new Thread(print);
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

class PrintRunnable implements Runnable {

    @Override
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