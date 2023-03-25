package basic.study.chapter21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadlineTest {

    public static void main(String[] args) throws IOException {

        LineNumberReader in = new LineNumberReader(new FileReader("abc.txt"));
        for (;;) {
            String line = in.readLine();
            if (line == null) { break; }
            int num = in.getLineNumber();
            System.out.printf("%4d : %s\n", num, line);
        }
    }
}
