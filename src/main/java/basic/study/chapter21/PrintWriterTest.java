package basic.study.chapter21;

import java.io.*;

public class PrintWriterTest {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter out = new PrintWriter("format.txt");
        int i = 1234;
        double d = 56.789;
        String str = "문자열";
        out.printf("%6d, %10.2f, %s", i, d, str);   //콘솔에 안찍히고 파일에
        out.println("이것도~?");   //콘솔에 안찍히고 파일에
        out.close();
    }
}
