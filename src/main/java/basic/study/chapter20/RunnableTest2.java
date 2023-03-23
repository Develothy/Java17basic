package basic.study.chapter20;

public class RunnableTest2 {

    public static void main(String[] args) {

        PrintRunnable2 print = new PrintRunnable2();
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

class PrintRunnable2 extends PrintClass implements Runnable {

    @Override
    public void run() {
        printChar();
    }
}

class PrintClass {

    public void printChar() {
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