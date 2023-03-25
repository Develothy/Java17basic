package basic.study.chapter21;

import java.io.FileReader;
import java.io.IOException;

public class EncodingTest {

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("abc.txt");
        //FileReader in = new FileReader("abc-Unicode.txt");
        //FileReader in = new FileReader("abc-Utf8.txt");
        //FileReader in = new FileReader("abc-Utf8nb.txt");
        char[] text = new char[1000];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " +  num);
        System.out.println(text);
        in.close();
    }
}
