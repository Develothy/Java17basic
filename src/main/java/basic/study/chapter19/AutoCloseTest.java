package basic.study.chapter19;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseTest {

    public static void main(String[] args) {

        byte[] data = { 8,9,0,6,2,9,9};
        try (FileOutputStream out = new FileOutputStream("test.bin")) {
            out.write(data);
            System.out.println("write success");
        } catch (IOException e) {
            System.out.println("File output error");
        }
    }
}
