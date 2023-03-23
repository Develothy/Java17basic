package basic.study.chapter20;

public class DemonTest {

    public static void main(String[] args) {

        PrintThread8 worker = new PrintThread8();
        worker.setDaemon(true);
        worker.start();

        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            try { Thread.sleep(500);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}

class PrintThread8 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print("save");
            try { Thread.sleep(2000);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}
