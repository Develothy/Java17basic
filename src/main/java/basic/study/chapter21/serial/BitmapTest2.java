package basic.study.chapter21.serial;

import java.io.*;

public class BitmapTest2 {

    public static void main(String[] args) throws Exception {

        Bitmap girl = new Bitmap(32000);
        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
        out.writeObject(girl);
        out.close();

        // 파일로 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
        Bitmap girl2 = (Bitmap) in.readObject();
        in.close();
    }
}

class Bitmap2 implements Serializable {
    byte[] raster;

    public Bitmap2(int width) {
        raster = new byte[width];
        int i;
        for (i=0; i<100; i++) { raster[i] = 1; }
        for (i=100; i<width/2; i++) { raster[i] = 8; }
        for (i=width; i<width; i++) { raster[i] = 7; }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(raster.length);
        int num = 1;
        byte value = raster[0];
        for (int i=0; i < raster.length; i++) {
            if (value == raster[i]) {
                num++;
            } else {
                out.writeByte(value);
                out.writeInt(num);
                num = 1;
                value = raster[i];
            }
        }
        if (num != 1) {
            out.writeByte(value);
            out.writeInt(num);
        }
    }

    private void readObject(ObjectInputStream in) throws IOException {
        int length = in.readInt();
        raster = new byte[length];
        int num;
        byte value;
        int offset;
        for (offset = 0; offset < length;) {
            value = in.readByte();
            num = in.readInt();
            for (int i = 0; i < num; i++) {
                raster[offset] = value;
                offset++;
            }
        }
    }
}

