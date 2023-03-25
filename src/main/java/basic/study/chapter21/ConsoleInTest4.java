package basic.study.chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInTest4 {

    public static void main(String[] args) {
        System.out.println("정수를 입력하세요~");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);
        try {
            String str = b.readLine();
            int i = Integer.parseInt(str);
            System.out.println("입력값의 2배 = " + i*2);
        } catch (IOException e) {
            System.out.println("input error");
            // 문자 입력 시 NumberFormatException
        }
    }
}
