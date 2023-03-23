package basic.study.chapter20;

public class InterruptTest2 {

    public static void main(String[] args) {
        CalcThread2 worker = new CalcThread2();
        worker.start();
        try { Thread.sleep(3000);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        worker.interrupt();
    }
}

class CalcThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\n계산 취소");
            return;
        }
        System.out.println("\n계산완료");
    }
}
