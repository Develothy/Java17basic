package basic.study.chapter21.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

    public static void main(String[] args) throws IOException {

        createRandomAccess2(createRandomAccess());

    }
    static void createRandomAccess2(RandomAccessFile file) throws IOException {

        file = new RandomAccessFile("random.dat", "r");
        file.seek(4);
        byte value = file.readByte();
        System.out.print("\n포인터 이동 읽기 : " + value);
        file.close();
    }

    static RandomAccessFile createRandomAccess() throws IOException {
        byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        RandomAccessFile file = new RandomAccessFile("random.dat", "rw");
        file.write(data);
        System.out.println("Write success");

        file.seek(0);
        for (;;) {
            int value = file.read();
            if (value == -1) { break; }
            System.out.print(value);
        }
        file.close();
        return file;
    }
}
