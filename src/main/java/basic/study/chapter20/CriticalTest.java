package basic.study.chapter20;

public class CriticalTest {

    public static void main(String[] args) {
        Memory3 mem = new Memory3(16);
        Download3 down = new Download3(mem);
        Play3 play = new Play3(mem);

        down.start();
        play.start();
    }
}

class Memory3 {
    int[] buffer;
    int size;
    int progress;

    Memory3(int size) {
        this.size = size;
        buffer = new int[size];
        progress = 0;
    }
}

class Download3 extends Thread {
    Memory3 mem;

    Download3(Memory3 mem) {
        this.mem = mem;
    }
    @Override
    public void run() {
        for (int off = 0; off < mem.size; off +=2) {
            synchronized (mem) {
                for (int chunk = 0; chunk < 2; chunk++) {
                    mem.buffer[off + chunk] = off + chunk;
                    mem.progress = off + chunk + 1;
                    try {Thread.sleep(200);} catch (InterruptedException e) {System.out.println(e.getMessage());}
                }
            }
        }
    }
}

class Play3 extends Thread {
    Memory3 mem;

    Play3(Memory3 mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        for (;;) {
            synchronized (mem) {
                for (int off = 0; off < mem.progress; off++) {
                    System.out.print(mem.buffer[off] + " ");
                }
                System.out.println();
                if (mem.progress == mem.size) break;
                try { Thread.sleep(500);} catch (InterruptedException e) { System.out.println(e.getMessage());}
            }
        }
    }
}