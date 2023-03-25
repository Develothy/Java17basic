package basic.study.chapter21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriteTest{

    public static void main(String[] args) throws IOException   {

        String str = "자바 Stream 입출력";
        FileWriter out = new FileWriter("abc.txt");
        out.write(str);
        out.close();
        System.out.println("Write success");

        FileReader in = new FileReader("abc.txt");
        int ch;
        for (;;) {
            ch = in.read();
            if( ch == -1) break;
            System.out.print((char) ch);
        }
        in.close();
        System.out.println();

        in = new FileReader("text.txt");
        char[] text = new char[100];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " + num);
        System.out.println(text);
        in.close();
    }

}
