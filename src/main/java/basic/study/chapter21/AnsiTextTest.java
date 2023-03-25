package basic.study.chapter21;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class AnsiTextTest {

    public static void main(String[] args) throws IOException {
        String text = "우리나라 대한민국`n1234abcd\n니것은 ANSI 텍스트입니다.";
        byte[] ansi = text.getBytes("euc-kr");
        FileOutputStream out = new FileOutputStream("ansi.txt");
        out.write(ansi);
        out.close();
        System.out.println("Write success");


    }
}
