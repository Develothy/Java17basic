package basic.study.chapter20;

public class InterruptTest {

    public static void main(String[] args) {
        CalcThread worker = new CalcThread();
        worker.start();
    }
}

class CalcThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try { Thread.sleep(1000);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
        System.out.println("\n계산완료");
    }
}
