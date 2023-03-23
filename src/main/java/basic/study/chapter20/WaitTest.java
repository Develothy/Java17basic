package basic.study.chapter20;

public class WaitTest {

    public static void main(String[] args) {

        Memory5 mem = new Memory5(16);
        Download5 down = new Download5(mem);
        Play5 play = new Play5(mem);

        down.start();
        play.start();
    }
}

class Memory5 {
    int[] buffer;
    int size;
    int progress;

    Memory5(int size) {
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

class Download5 extends Thread {
    Memory5 mem;

    Download5(Memory5 mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        for (int off = 0; off < mem.size; off ++) {
            mem.buffer[off] = off;
            mem.progress = off + 1;
            try { Thread.sleep(200);} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
        synchronized (mem) {
            mem.notify();
        }
    }
}

class Play5 extends Thread {
    Memory5 mem;

    Play5(Memory5 mem) {
        this.mem = mem;
    }

    @Override
    public void run() {
        synchronized (mem) {
            try {
                mem.wait(); // 완성될 때까지 대기
            } catch (InterruptedException e){}
        }
        for (int off = 0; off < mem.progress; off++) {
            System.out.print(mem.buffer[off] + " ");
        }
        System.out.println();
    }
}

