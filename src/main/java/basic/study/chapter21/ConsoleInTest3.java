package basic.study.chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInTest3 {

    public static void main(String[] args) {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);
        try {
            String str = b.readLine();
            System.out.println(str);
            System.out.println("입력완료");
        } catch (IOException e) {
            System.out.println("input error");
        }
    }
}
