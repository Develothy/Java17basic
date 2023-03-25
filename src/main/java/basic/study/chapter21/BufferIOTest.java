package basic.study.chapter21;

import java.io.*;

public class BufferIOTest {

    public static void main(String[] args) throws IOException {

        byte[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 4, 8, 9, 7, 9 };
        FileOutputStream fout = new FileOutputStream("test.buf");
        BufferedOutputStream out = new BufferedOutputStream(fout);
        //BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("text.buf"));
        out.write(data);
        out.close();
        System.out.println("Write success");

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.buf"));
        byte[] indata = new byte[15];
        in.read(indata,0,15);
        in.close();
        for (byte b : indata) {
            System.out.print(b);
        }
    }
}
