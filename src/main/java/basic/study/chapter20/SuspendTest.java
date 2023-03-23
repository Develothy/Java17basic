package basic.study.chapter20;

public class SuspendTest {

    public static void main(String[] args) {

        PrintThread5 worker = new PrintThread5();
        worker.start();
        for (int num = 0; num < 30; num++) {
            System.out.print("O");
            try { Thread.sleep(100);} catch (InterruptedException e) { System.out.println(e.getMessage());}
            if (num == 5) worker.suspend();
            if (num == 25) worker.resume();
        }
    }
}

class PrintThread5 extends Thread {
    @Override
    public void run() {
        for (int num = 0; num < 30; num++) {
            System.out.print("X");
            try { Thread.sleep(100);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}
