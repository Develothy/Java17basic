package basic.study.chapter21;

import java.io.*;

public class DataIOTest {

    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
        out.writeInt(1234);
        out.writeDouble(3.123456);
        out.writeUTF("String 문자열");
        out.close();
        System.out.println("Write success");

        DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
        int i = in.readInt();
        double d = in.readDouble();
        String str = in.readUTF();
        System.out.printf("i = %d, d = %f, str = %s", i, d, str);
    }
}
