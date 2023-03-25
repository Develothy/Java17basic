package basic.study.chapter21.serial;

import java.io.*;

public class BitmapTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 파일로 출력
        Bitmap girl = new Bitmap(32000);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
        out.writeObject(girl);
        out.close();

        // 파일로 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
        Bitmap girl2 = (Bitmap) in.readObject();
        in.close();
    }
}

class Bitmap implements Serializable {

    byte[] raster;

    public Bitmap(int width) {
        raster = new byte[width];
        int i;
        for (i=0; i<100; i++) { raster[i] = 1; }
        for (i=100; i<width/2; i++) { raster[i] = 8; }
        for (i=width; i<width; i++) { raster[i] = 7; }
    }
}