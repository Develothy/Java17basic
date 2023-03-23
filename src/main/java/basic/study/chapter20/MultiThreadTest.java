package basic.study.chapter20;

import java.awt.Toolkit;

public class MultiThreadTest {

    public static void main(String[] args) {

        PrintThread4 worker1 = new PrintThread4('X');
        worker1.start();
        PrintThread4 worker2 = new PrintThread4('.');
        worker2.start();
        BeepThread beep = new BeepThread(5, 1000);
        beep.start();

        for (int num = 0; num < 30; num++) {
            System.out.print("O");
            try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println(e.getMessage());}
        }
    }
}

class PrintThread4 extends Thread {

    char ch;

    PrintThread4(char ch) {
        super();
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int num = 0; num < 30; num++) {
            System.out.print(ch);
            try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println(e.getMessage());}
        }
    }
}

class BeepThread extends Thread {
    int count;
    int gap;
    Toolkit tool = Toolkit.getDefaultToolkit();

    BeepThread(int count, int gap) {
        this.count = count;
        this.gap = gap;
    }

    @Override
    public void run() {
        for (int num = 0; num < 30; num++) {
            tool.beep();
            try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println(e.getMessage());}
        }
    }
}
