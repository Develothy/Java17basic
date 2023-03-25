package basic.study.chapter21;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInTest2 {

    public static void main(String[] args) {
        int name ;
        System.out.println("이름을 입력하세요~");
        InputStreamReader r = new InputStreamReader(System.in);
        for(;;) {
            try {
                name = r.read();
                if (name == -1) { break; }
                System.out.print((char) name);
            } catch (IOException e) {
                System.out.println("input error");
            }
        }
        System.out.println("입력 완료");
    }
}
