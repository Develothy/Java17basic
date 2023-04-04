package basic.study.chapter21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferText {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("abc.txt"));
        char[] text = new char[1000];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " + num);
        System.out.println(text);
        in.close();
    }
}
