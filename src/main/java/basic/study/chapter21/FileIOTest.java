package basic.study.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

    public static void main(String[] args) throws IOException {
        //fileWriteTest();
        //fileReadTest();
        //blockReadTest();
        blockReadTest2();
    }

    static void blockReadTest2() throws IOException {
        FileInputStream in = new FileInputStream("test.bin");
        byte[] data = new byte[2];
        int len;
        for (;;) {
            len = in.read(data);
            if (len == -1) break;
            System.out.print(data);
        }
        in.close();
    }
    static void blockReadTest() throws IOException {
        FileInputStream in = new FileInputStream("test.bin");
        int data;
        for (;;) {
            data = in.read();
            if (data == 1) break;
            System.out.print(data);
        }
        in.close();
    }

    static void fileReadTest() throws IOException {
        FileInputStream in = new FileInputStream("test.bin");
        int avail = in.available();
        byte[] data = new byte[avail];
        in.read(data);
        in.close();
        for (byte b : data) {
            System.out.print(b);
        }
    }

    static void fileWriteTest() {

        byte[] data = { 8,9,0,6,2,9,9 };

        try (FileOutputStream out = new FileOutputStream("test.bin");){
            out.write(data);
            System.out.println("Write Success");
        } catch (IOException e) {
            System.out.println("File output error");
        }
    }
}
