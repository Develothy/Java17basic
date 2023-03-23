package basic.study.chapter20;

public class SyncMethodTest {

    public static void main(String[] args) {

        Memory4 mem = new Memory4(16);
        Download4 down = new Download4(mem);
        Play4 play = new Play4(mem);

        down.start();
        play.start();
    }
}

class Memory4 {
    int[] buffer;
    int size;
    int progress;

    Memory4(int size) {
        this.size = size;
        buffer = new int[size];
        progress = 0;
    }

    synchronized void downChunk(int off) {
        for (int chunk = 0; chunk < 2; chunk++) {
            buffer[off + chunk] = off + chunk;
            progress = off + chunk + 1;
            try { Thread.sleep(200);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
    synchronized void playDowned() {
        for (int off = 0; off < progress; off++) {
            System.out.print(buffer[off] + " ");
        }
        System.out.println();
    }
}

class Download4 extends Thread {
    Memory4 mem;

    Download4(Memory4 mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        for (int off = 0; off < mem.size; off += 2) {
            mem.downChunk(off);
        }
    }
}

class Play4 extends Thread {
    Memory4 mem;

    Play4(Memory4 mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        for (;;) {
            mem.playDowned();
            if (mem.progress == mem.size) break;
            try { Thread.sleep(500);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
    }
}
