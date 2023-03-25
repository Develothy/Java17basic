package basic.study.chapter21;

import java.io.*;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        System.out.println("복사 시작");
        FileInputStream src = new FileInputStream("src.dat");
        FileOutputStream dest = new FileOutputStream("dest.dat");
        int data;
        for (;;) {
            data = src.read();
            if (data == -1) { break; }
            dest.write(data);
        }
        src.close();
        dest.close();
        System.out.println("복사 완료");
        System.out.println( (System.currentTimeMillis() - start )/1000.0+ "초 걸림");
    }
}
