package basic.study.chapter20;

public class SyncTest2 {

    public static void main(String[] args) {
        Memory2 mem = new Memory2(16);
        Download2 down = new Download2(mem);
        Play2 play = new Play2(mem);

        down.start();
        play.start();
    }
}

class Memory2 {
    int[] buffer;
    int size;
    int progress;

    Memory2(int size) {
        this.size = size;
        buffer = new int[size];
        progress = 0;
    }
}

class Download2 extends Thread {
    Memory2 mem;

    Download2(Memory2 mem) {
        this.mem = mem;
    }
    @Override
    public void run() {
        for (int off = 0; off < mem.size; off += 2) {
            for (int chunk = 0; chunk < 2; chunk++) {
                mem.buffer[off + chunk] = off + chunk;
                mem.progress = off + chunk + 1;
                try {Thread.sleep(200);} catch (InterruptedException e) {System.out.println(e.getMessage());}
            }
        }
    }
}

class Play2 extends Thread {
    Memory2 mem;

    Play2(Memory2 mem) {
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