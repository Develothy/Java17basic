package basic.study.chapter20;

public class SyncTest {

    public static void main(String[] args) {
        Memory mem = new Memory(16);
        Download down = new Download(mem);
        Play play = new Play(mem);

        down.start();
        play.start();
    }
}

class Memory {
    int[] buffer;
    int size;
    int progress;

    Memory(int size) {
        this.size = size;
        buffer = new int[size];
        progress = 0;
    }
}

class Download extends Thread {
    Memory mem;

    Download(Memory mem) {
        this.mem = mem;
    }
    @Override
    public void run() {
        for (int off = 0; off < mem.size; off++) {
            mem.buffer[off] = off;
            mem.progress = off + 1;
            try { Thread.sleep(100);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}

class Play extends Thread {
    Memory mem;

    Play(Memory mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        for (;;) {
            for (int off = 0; off < mem.progress; off++) {
                System.out.print(mem.buffer[off] + " ");
            }
            System.out.println();
            if (mem.progress == mem.size) break;
            try { Thread.sleep(500);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}