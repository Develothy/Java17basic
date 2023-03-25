package basic.study.chapter21;

import java.io.FileInputStream;
import java.io.IOException;

public class StringCharTest {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("abc.txt");
        byte[] text = new byte[1000];
        int num = in.read(text);
        String utftext = new String(text, "euc-kr");
        System.out.println("읽은 바이트 수 = " + num);
        System.out.println(utftext);
        in.close();
    }
}
