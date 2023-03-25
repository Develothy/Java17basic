package basic.study.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharSetTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fi = new FileInputStream("abc.txt");
        InputStreamReader in = new InputStreamReader(fi, "euc-kr");
        char[] text = new char[1000];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " + num);
        System.out.println(text);
        in.close();
    }
}
